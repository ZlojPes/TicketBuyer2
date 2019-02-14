package com.ospavliuk.ticketbuyer2.model.jsonparser.placelist;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Places {
    @JsonProperty("А")
    private List<String> placeList;

    @JsonProperty("Б")
    private List<String> placeList2;

    public List<String> getPlaceList() {
        return placeList != null ? placeList : placeList2;
    }
}
