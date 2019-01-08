package com.ospavliuk.ticketbuyer2.model.jsonparser.placelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

public class Places {
    @Getter
    @JsonProperty("А")
    private List<String> placeList;
}
