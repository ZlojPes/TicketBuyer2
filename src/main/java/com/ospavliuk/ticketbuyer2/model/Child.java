package com.ospavliuk.ticketbuyer2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Child {

    @JsonProperty("minDate")
    String minDate;

    @JsonProperty("maxDate")
    String maxDate;
}
