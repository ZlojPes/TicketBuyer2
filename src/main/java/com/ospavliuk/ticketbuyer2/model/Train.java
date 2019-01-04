package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Train {
    @JsonProperty("num")
    String number;

    @JsonProperty("category")
    int category;

    @JsonProperty("isTransformer")
    boolean isTransformer;

    @JsonProperty("travelTime")
    String travelTime;

    @JsonProperty("from")
    StationJson from;

    @JsonProperty("to")
    StationJson to;

    @JsonProperty("types")
    List<WagonType> wagonTypeList;

    @JsonProperty("child")
    Child child;

    @JsonProperty("allowStudent")
    boolean allowStudent;

    @JsonProperty("allowBooking")
    boolean allowBooking;

    @JsonProperty("isCis")
    boolean isCis;

    @JsonProperty("isEurope")
    boolean isEurope;

    @JsonProperty("allowPrivilege")
    boolean allowPrivilege;
}
