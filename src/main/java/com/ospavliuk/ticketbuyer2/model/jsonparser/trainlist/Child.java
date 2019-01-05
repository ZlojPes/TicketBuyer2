package com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Child {

    @JsonProperty("minDate")
    private String minDate;

    @JsonProperty("maxDate")
    private String maxDate;
}
