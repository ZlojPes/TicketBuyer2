package com.ospavliuk.ticketbuyer2.model.jsonparser.wagonlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class WagonParser {
    @Getter
    @JsonProperty("data")
    Data data;
}
