package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StationJson {

    @JsonProperty("code")
    String code;

    @JsonProperty("station")
    String station;

    @JsonProperty("stationTrain")
    String stationTrain;

    @JsonProperty("date")
    String date;

    @JsonProperty("time")
    String time;


    @JsonProperty("sortTime")
    int sortTime;

    @JsonProperty("srcDate")
    String srcDate;

}
