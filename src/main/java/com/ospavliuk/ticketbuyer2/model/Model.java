package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ospavliuk.ticketbuyer2.Gui;
import com.ospavliuk.ticketbuyer2.controller.Controller;
import com.ospavliuk.ticketbuyer2.controller.Passenger;
import com.ospavliuk.ticketbuyer2.model.jsonparser.placelist.PlaceParser;
import com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist.TrainParser;
import com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist.WagonType;
import com.ospavliuk.ticketbuyer2.model.jsonparser.wagonlist.WagonParser;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model extends Thread {
    private final Controller controller;
    private final Gui gui;

    public Model(Controller controller, Gui gui) {
        this.controller = controller;
        this.gui = gui;
    }

    @Override
    public void run() {
        super.run();
        gui.cls();
        System.out.println("Model is running");
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> props = new HashMap<>();

        Map<String, String> params = new HashMap<>();
        props.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
        props.put("Referer", "https://booking.uz.gov.ua/ru/");
        params.put("from", String.valueOf(controller.getStartStation()));
        params.put("to", String.valueOf(controller.getDestStation()));
        params.put("date", controller.getDate());
        params.put("time", controller.getTime());
        try {
            String urlSource = HtmlGetterUZ.getUrlSource("https://booking.uz.gov.ua/ru/", "GET", props, null);
            if (!urlSource.contains("Поиск поездов на")) {
                System.out.println("Ошибка загрузки главной страницы УЗ");
                stopModel();
                return;
            }
            TrainParser trainParser;
//            while (true) {
            urlSource = HtmlGetterUZ.getUrlSource("https://booking.uz.gov.ua/ru/train_search/", "POST", props, params);
            trainParser = mapper.readValue(urlSource, TrainParser.class);
            String warningMessage = trainParser.getData().getWarning();
            if (warningMessage != null) {
                gui.println(warningMessage);
                return;
            }
            trainParser.getData().getTrainList().stream().
                    filter(train -> train.getNumber().contains(gui.getTrainNumber())).
                    forEach(train -> {
                        List<WagonType> types = train.getWagonTypeList();
                        types.stream().
                                filter(wagonType -> wagonType.getLetter().contains(controller.getSelectedWagonType())).
                                forEach(wagonType -> {
                                    gui.println(train.getNumber() + " В пути: " + train.getTravelTime() + "\n" + wagonType.getTitle() + ": " + wagonType.getPlaces());
                                    params.put("train", train.getNumber());
                                    params.put("wagon_type_id", wagonType.getLetter());
                                    String urlSource2;
                                    try {
                                        urlSource2 = HtmlGetterUZ.getUrlSource("https://booking.uz.gov.ua/ru/train_wagons/", "POST", props, params);
                                        WagonParser wagonParser = mapper.readValue(urlSource2, WagonParser.class);
                                        wagonParser.getData().getSelectedCategoryWagons().forEach(type -> {
                                            gui.println("Price: " + (float) type.getPrices().getPrice() / 100);
                                            params.put("wagon_num", String.valueOf(type.getNumber()));
                                            params.put("wagon_type", type.getType());
                                            params.put("wagon_class", type.getWagonClass());
                                            try {
                                                String urlSource3 = HtmlGetterUZ.getUrlSource(" https://booking.uz.gov.ua/ru/train_wagon/", "POST", props, params);
                                                PlaceParser placeParser = mapper.readValue(urlSource3, PlaceParser.class);
                                                gui.print("Места: ");
                                                placeParser.getData().getPlaces().getPlaceList().forEach(place -> gui.print(place + ", "));
                                                gui.println("");
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }

                                        });
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    List<Passenger> passengerList = controller.getPassengerList();
                                    System.out.println(passengerList.get(0).getName());
                                });
                    });
//            }
            System.out.println(params.entrySet().size());
            HtmlGetterUZ.getCookies();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopModel() {
        System.out.println("Model has been stopped");
    }
}
