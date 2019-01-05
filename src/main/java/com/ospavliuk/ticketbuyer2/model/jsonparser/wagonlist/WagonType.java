package com.ospavliuk.ticketbuyer2.model.jsonparser.wagonlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class WagonType {
    @JsonProperty("type_id")
    String id;

    @JsonProperty("title")
    String title;

    @JsonProperty("letter")
    String letter;

    @JsonProperty("free")
    int free;

    @JsonProperty("cost")
    int cost;

    @JsonProperty("isOneCost")
    boolean isOneCost;
}
