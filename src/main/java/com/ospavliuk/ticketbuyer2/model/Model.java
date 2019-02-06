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
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

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
        AtomicBoolean success = new AtomicBoolean(false);
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
                controller.startStop();
                return;
            }
            TrainParser trainParser;
            while (true) {
                long start = System.currentTimeMillis();
                urlSource = HtmlGetterUZ.getUrlSource("https://booking.uz.gov.ua/ru/train_search/", "POST", props, params);
                trainParser = mapper.readValue(urlSource, TrainParser.class);
                String warningMessage = trainParser.getData().getWarning();
                if (warningMessage != null) {
                    gui.println(warningMessage);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (!controller.isRunning()) {
                        return;
                    }
                    continue;
                }
                List<Passenger> passengerList = controller.getPassengerList();
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
                                                    List<String> placeList = placeParser.getData().getPlaces().getPlaceList();
                                                    if (placeList.size() >= passengerList.size()) {
                                                        Iterator<String> iterator = placeList.iterator();
                                                        passengerList.forEach(passenger -> {
                                                            if (passenger.getPlace().isEmpty() && iterator.hasNext()) {
                                                                passenger.setPlace(iterator.next());
                                                            }
                                                        });
                                                        Map<String, String> orderParams = new LinkedHashMap<>();
                                                        for (int i = 0; i < passengerList.size(); i++) {
                                                            Passenger passenger = passengerList.get(i);
                                                            orderParams.put("places[" + i + "][ord]", String.valueOf(i));
                                                            orderParams.put("places[" + i + "][from]", String.valueOf(controller.getStartStation()));
                                                            orderParams.put("places[" + i + "][to]", String.valueOf(controller.getDestStation()));
                                                            orderParams.put("places[" + i + "][train]", train.getNumber());
                                                            orderParams.put("places[" + i + "][date]", controller.getDate());
                                                            orderParams.put("places[" + i + "][wagon_num]", String.valueOf(type.getNumber()));
                                                            orderParams.put("places[" + i + "][wagon_class]", type.getWagonClass());
                                                            String t = type.getType();
                                                            orderParams.put("places[" + i + "][wagon_type]", t);
                                                            orderParams.put("places[" + i + "][wagon_railway]", "43");
                                                            orderParams.put("places[" + i + "][charline]", "А");
                                                            orderParams.put("places[" + i + "][firstname]", passenger.getName());
                                                            orderParams.put("places[" + i + "][lastname]", passenger.getSurName());
                                                            orderParams.put("places[" + i + "][bedding]", t.equals("К") | t.equals("П") | t.equals("Л") ? "1" : "0");
                                                            orderParams.put("places[" + i + "][services][]", "Н");
                                                            orderParams.put("places[" + i + "][child]", passenger.isChild() ? controller.getChildDate() : "");
                                                            orderParams.put("places[" + i + "][student]", "");
                                                            orderParams.put("places[" + i + "][reserve]", "0");
                                                            orderParams.put("places[" + i + "][place_num]", passenger.getPlace());
                                                        }
                                                        orderParams.forEach((key, value) -> System.out.println(key + ":" + value));
                                                        String urlSource4 = HtmlGetterUZ.getUrlSource(" https://booking.uz.gov.ua/ru/cart/add/", "POST", props, orderParams);
                                                        System.out.println("\n" + urlSource4);
                                                        if (urlSource4.contains("\"brand\":\"" + train.getNumber()) && urlSource4.contains("\"placesCount\":" + passengerList.size())) {
                                                            gui.println("Билеты успешно добавлены в корзину!");
                                                            gui.println(HtmlGetterUZ.getSessionId());
                                                            success.set(true);
                                                        } else {
                                                            gui.print("Ошибка добавления в корзину");
                                                        }
                                                        controller.startStop();
                                                    }
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }
                                            });
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    });
                        });
                if (!controller.isRunning()) {
                    return;
                }
                long delay = System.currentTimeMillis() - start;
                if (delay < 1000) {
                    try {
                        Thread.sleep(1000 - delay);
                        System.out.println("delay");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
