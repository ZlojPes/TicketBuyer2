package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ospavliuk.ticketbuyer2.model.jsonparser.wagonlist.WagonParser;

import java.io.IOException;

public class Test {
    static String json = "{\n" +
            "  \"data\": {\n" +
            "    \"types\": [\n" +
            "      {\n" +
            "        \"type_id\": \"Л\",\n" +
            "        \"title\": \"Люкс\",\n" +
            "        \"letter\": \"Л\",\n" +
            "        \"free\": 14,\n" +
            "        \"cost\": 118229,\n" +
            "        \"isOneCost\": true\n" +
            "      },\n" +
            "      {\n" +
            "        \"type_id\": \"К\",\n" +
            "        \"title\": \"Купе\",\n" +
            "        \"letter\": \"К\",\n" +
            "        \"free\": 33,\n" +
            "        \"cost\": 36699,\n" +
            "        \"isOneCost\": true\n" +
            "      },\n" +
            "      {\n" +
            "        \"type_id\": \"П\",\n" +
            "        \"title\": \"Плацкарт\",\n" +
            "        \"letter\": \"П\",\n" +
            "        \"free\": 51,\n" +
            "        \"cost\": 20656,\n" +
            "        \"isOneCost\": true\n" +
            "      }\n" +
            "    ],\n" +
            "    \"wagons\": [\n" +
            "      {\n" +
            "        \"num\": 4,\n" +
            "        \"type_id\": \"К\",\n" +
            "        \"type\": \"К\",\n" +
            "        \"class\": \"В\",\n" +
            "        \"railway\": 43,\n" +
            "        \"free\": 33,\n" +
            "        \"byWishes\": false,\n" +
            "        \"hasBedding\": true,\n" +
            "        \"obligatoryBedding\": false,\n" +
            "        \"services\": [\n" +
            "          \"М\",\n" +
            "          \"Н\"\n" +
            "        ],\n" +
            "        \"prices\": {\n" +
            "          \"А\": 36699\n" +
            "        },\n" +
            "        \"reservePrice\": 1700,\n" +
            "        \"allowBonus\": false,\n" +
            "        \"air\": null\n" +
            "      }\n" +
            "    ],\n" +
            "    \"tplPage\": \"html\"\n" +
            "  }\n" +
            "}";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        WagonParser wagonParser = mapper.readValue(json, WagonParser.class);
        System.out.println(wagonParser.getData().getSelectedCategoryWagons().get(0).getPrices().getPrice());
    }
}
