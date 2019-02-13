package com.ospavliuk.ticketbuyer2.model.jsonparser.wagonlist;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@SuppressWarnings("WeakerAccess")
public class Prices {
    @JsonProperty("А")
    int price1;

    @JsonProperty("Б")
    int price2;

    public int getPrice() {
        return price1 != 0 ? price1 : price2;
    }
}