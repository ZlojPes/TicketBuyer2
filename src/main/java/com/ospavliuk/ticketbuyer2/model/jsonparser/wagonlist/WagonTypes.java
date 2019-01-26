package com.ospavliuk.ticketbuyer2.model.jsonparser.wagonlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@SuppressWarnings("WeakerAccess")
@Getter
public class WagonTypes {
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
