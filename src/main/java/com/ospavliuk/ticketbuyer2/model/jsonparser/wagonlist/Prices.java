package com.ospavliuk.ticketbuyer2.model.jsonparser.wagonlist;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@SuppressWarnings("WeakerAccess")
public class Prices {
    @Getter
    @JsonProperty("А")
    int price;
}