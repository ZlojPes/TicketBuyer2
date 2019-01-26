package com.ospavliuk.ticketbuyer2.model.jsonparser.wagonlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@SuppressWarnings("WeakerAccess")
@Getter
public class Wagon {
    @JsonProperty("num")
    int number;

    @JsonProperty("type_id")
    String typeId;

    @JsonProperty("type")
    String type;

    @JsonProperty("class")
    String wagonClass;

    @JsonProperty("railway")
    int railway;

    @JsonProperty("free")
    int free;

    @JsonProperty("byWishes")
    boolean byWishes;

    @JsonProperty("hasBedding")
    boolean hasBedding;

    @JsonProperty("obligatoryBedding")
    boolean obligatoryBedding;

    @JsonProperty("reservePrice")
    int reservePrice;

    @JsonProperty("allowBonus")
    boolean allowBonus;

    @JsonProperty("air")
    String air;

    @JsonProperty("services")
    List<String> services;

    @JsonProperty("prices")
    Prices prices;
}
