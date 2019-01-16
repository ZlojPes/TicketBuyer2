package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist.TrainParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Map<String, String> prop = new HashMap<>();
            List<String> params = new ArrayList<>();
            prop.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
            prop.put("Referer", "https://booking.uz.gov.ua/ru/?from=2204001&to=2208001&date=2019-01-30&time=00%3A00&url=train-list");
            params.add("date=2019-01-30");
            params.add("from=2204001");
            params.add("time=00:00");
            params.add("to=2208001");
            String urlSource = HtmlGetterUZ.getUrlSource("https://booking.uz.gov.ua/ru/train_search/", "POST", prop, params);
            TrainParser trainParser = mapper.readValue(urlSource, TrainParser.class);
            System.out.println(trainParser.getData().getTrainList().get(1).getNumber());
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
