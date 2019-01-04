package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonData {
    @JsonProperty("data")
    Data data;

    static String json = "{\n" +
            "  \"data\": {\n" +
            "    \"list\": [\n" +
            "      {\n" +
            "        \"num\": \"059О\",\n" +
            "        \"category\": 0,\n" +
            "        \"isTransformer\": 0,\n" +
            "        \"travelTime\": \"13:05\",\n" +
            "        \"from\": {\n" +
            "          \"code\": \"2204001\",\n" +
            "          \"station\": \"Харьков-Пасс\",\n" +
            "          \"stationTrain\": \"Харьков-Пасс\",\n" +
            "          \"date\": \"пятница, 15.02.2019\",\n" +
            "          \"time\": \"17:04\",\n" +
            "          \"sortTime\": 1550243040,\n" +
            "          \"srcDate\": \"2019-02-15\"\n" +
            "        },\n" +
            "        \"to\": {\n" +
            "          \"code\": \"2208001\",\n" +
            "          \"station\": \"Одесса-Главная\",\n" +
            "          \"stationTrain\": \"Одесса-Главная\",\n" +
            "          \"date\": \"суббота, 16.02.2019\",\n" +
            "          \"time\": \"06:09\",\n" +
            "          \"sortTime\": 1550290140\n" +
            "        },\n" +
            "        \"types\": [\n" +
            "          {\n" +
            "            \"id\": \"Л\",\n" +
            "            \"title\": \"Люкс\",\n" +
            "            \"letter\": \"Л\",\n" +
            "            \"places\": 14\n" +
            "          },\n" +
            "          {\n" +
            "            \"id\": \"К\",\n" +
            "            \"title\": \"Купе\",\n" +
            "            \"letter\": \"К\",\n" +
            "            \"places\": 33\n" +
            "          },\n" +
            "          {\n" +
            "            \"id\": \"П\",\n" +
            "            \"title\": \"Плацкарт\",\n" +
            "            \"letter\": \"П\",\n" +
            "            \"places\": 51\n" +
            "          }\n" +
            "        ],\n" +
            "        \"child\": {\n" +
            "          \"minDate\": \"2005-02-16\",\n" +
            "          \"maxDate\": \"2019-01-03\"\n" +
            "        },\n" +
            "        \"allowStudent\": 1,\n" +
            "        \"allowBooking\": 1,\n" +
            "        \"isCis\": 0,\n" +
            "        \"isEurope\": 0,\n" +
            "        \"allowPrivilege\": 0\n" +
            "      },\n" +
            "      {\n" +
            "        \"num\": \"007Ш\",\n" +
            "        \"category\": 0,\n" +
            "        \"isTransformer\": 0,\n" +
            "        \"travelTime\": \"11:21\",\n" +
            "        \"from\": {\n" +
            "          \"code\": \"2204001\",\n" +
            "          \"station\": \"Харьков-Пасс\",\n" +
            "          \"stationTrain\": \"Харьков-Пасс\",\n" +
            "          \"date\": \"пятница, 15.02.2019\",\n" +
            "          \"time\": \"21:50\",\n" +
            "          \"sortTime\": 1550260200,\n" +
            "          \"srcDate\": \"2019-02-15\"\n" +
            "        },\n" +
            "        \"to\": {\n" +
            "          \"code\": \"2208001\",\n" +
            "          \"station\": \"Одесса-Главная\",\n" +
            "          \"stationTrain\": \"Одесса-Главная\",\n" +
            "          \"date\": \"суббота, 16.02.2019\",\n" +
            "          \"time\": \"09:11\",\n" +
            "          \"sortTime\": 1550301060\n" +
            "        },\n" +
            "        \"types\": [\n" +
            "          {\n" +
            "            \"id\": \"К\",\n" +
            "            \"title\": \"Купе\",\n" +
            "            \"letter\": \"К\",\n" +
            "            \"places\": 36\n" +
            "          }\n" +
            "        ],\n" +
            "        \"child\": {\n" +
            "          \"minDate\": \"2005-02-16\",\n" +
            "          \"maxDate\": \"2019-01-03\"\n" +
            "        },\n" +
            "        \"allowStudent\": 1,\n" +
            "        \"allowBooking\": 1,\n" +
            "        \"isCis\": 0,\n" +
            "        \"isEurope\": 0,\n" +
            "        \"allowPrivilege\": 0\n" +
            "      }\n" +
            "    ],\n" +
            "    \"tplPage\": \"html\",\n" +
            "    \"tplTrain\": \"html\"\n" +
            "  }\n" +
            "}\n";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonData jData = mapper.readValue(json, JsonData.class);
        System.out.println(jData.data.trainList.get(0).isTransformer);
    }
}
