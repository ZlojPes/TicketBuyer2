package com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
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
