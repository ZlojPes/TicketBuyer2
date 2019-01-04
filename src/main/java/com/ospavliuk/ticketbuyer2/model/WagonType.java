package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WagonType {
    @JsonProperty("id")
    String id;

    @JsonProperty("title")
    String title;

    @JsonProperty("letter")
    String letter;

    @JsonProperty("places")
    int places;
}
