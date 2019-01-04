package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Data {
    @JsonProperty("list")
    List<Train> trainList;

    @JsonProperty("tplPage")
    String tplPage;

    @JsonProperty("tplTrain")
    String tplTrain;
}
