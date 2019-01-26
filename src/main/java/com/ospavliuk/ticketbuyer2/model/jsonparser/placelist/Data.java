package com.ospavliuk.ticketbuyer2.model.jsonparser.placelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@SuppressWarnings("WeakerAccess")
@Getter
public class Data {

    @JsonProperty("places")
    private Places places;

    @JsonProperty("schemeId")
    private String schemeId;

    @JsonProperty("scheme")
    String scheme;
}
