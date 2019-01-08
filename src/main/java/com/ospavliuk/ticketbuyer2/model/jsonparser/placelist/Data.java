package com.ospavliuk.ticketbuyer2.model.jsonparser.placelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ospavliuk.ticketbuyer2.model.jsonparser.trainlist.Train;
import lombok.Getter;

import java.util.List;

public class Data {

    @Getter
    @JsonProperty("places")
    private Places places;

    @Getter
    @JsonProperty("schemeId")
    private String schemeId;

    @JsonProperty("scheme")
    String scheme;
}
