package com.ospavliuk.ticketbuyer2.model.jsonparser.placelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class PlaceParser {
    @Getter
    @JsonProperty("data")
    Data data;
}
