package com.ospavliuk.ticketbuyer2.model.jsonparser.wagonlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Data {

    @JsonProperty("types")
    List<WagonType> availableTypes;

    @JsonProperty("wagons")
    List<Wagon> selectedCategoryWagons;

    @JsonProperty("tplPage")
    String tplPage;

}
