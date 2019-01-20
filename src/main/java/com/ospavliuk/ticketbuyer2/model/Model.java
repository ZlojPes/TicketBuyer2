package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ospavliuk.ticketbuyer2.Gui;
import com.ospavliuk.ticketbuyer2.controller.Controller;
import com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist.TrainParser;
import com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist.WagonType;

import java.io.IOException;
import java.util.ArrayList;
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
        List<String> params = new ArrayList<>();
        props.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
        props.put("Referer", "https://booking.uz.gov.ua/ru/");
        params.add("date=" + controller.getDate());
        params.add("from=" + controller.getStartStation());
        params.add("time=" + controller.getTime());
        params.add("to=" + controller.getDestStation());
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
            trainParser.getData().getTrainList().
                    stream().
                    filter(train -> train.getNumber().matches(gui.getTrainNumber())).
                    forEach(train -> {
                gui.println(train.getNumber());
                List<WagonType> types = train.getWagonTypeList();
                if (types.size() == 0) {
                    gui.println("Мест нет");
                }
                types.forEach(wagonType -> gui.println(wagonType.getTitle() + ": " + wagonType.getPlaces()));
//                System.out.println();
            });
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopModel() {
        System.out.println("Model has been stopped");
    }
}
