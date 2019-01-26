package com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@SuppressWarnings("WeakerAccess")
@Getter
public class Data {

    @JsonProperty("list")
    List<Train> trainList;

    @JsonProperty("warning")
    String warning;

    @JsonProperty("tplPage")
    String tplPage;

    @JsonProperty("tplTrain")
    String tplTrain;
}
