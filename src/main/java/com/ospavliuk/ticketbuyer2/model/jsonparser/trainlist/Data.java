package com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

public class Data {

    @Getter
    @JsonProperty("list")
    List<Train> trainList;

    @JsonProperty("tplPage")
    String tplPage;

    @JsonProperty("tplTrain")
    String tplTrain;
}
