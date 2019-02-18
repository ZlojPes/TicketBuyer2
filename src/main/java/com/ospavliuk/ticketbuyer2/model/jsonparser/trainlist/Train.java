package com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@SuppressWarnings("WeakerAccess")
@Getter
public class Train {
    @JsonProperty("num")
    private String number;

    @JsonProperty("category")
    private int category;

    @JsonProperty("isTransformer")
    private boolean isTransformer;

    @JsonProperty("travelTime")
    private String travelTime;

    @JsonProperty("from")
    private StationJson from;

    @JsonProperty("to")
    private StationJson to;

    @JsonProperty("types")
    private List<WagonType> wagonTypeList;

    @JsonProperty("child")
    private Child child;

    @JsonProperty("allowStudent")
    private boolean allowStudent;

    @JsonProperty("allowBooking")
    private boolean allowBooking;

    @JsonProperty("isCis")
    private boolean isCis;

    @JsonProperty("isEurope")
    private boolean isEurope;

    @JsonProperty("allowPrivilege")
    private boolean allowPrivilege;

    @JsonIgnoreProperties("noReserve")
    private boolean noReserve;
}
