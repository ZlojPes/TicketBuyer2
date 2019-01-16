package com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
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
