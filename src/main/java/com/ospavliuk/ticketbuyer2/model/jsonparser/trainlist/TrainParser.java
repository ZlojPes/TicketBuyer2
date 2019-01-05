package com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class TrainParser {
    @Getter
    @JsonProperty("data")
    Data data;
}
