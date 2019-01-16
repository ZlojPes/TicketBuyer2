package com.ospavliuk.ticketbuyer2.controller;

import lombok.Getter;

import java.io.Serializable;

public class Station implements Serializable {
    static final long serialVersionUID = 5984516079037774658L;
    @Getter
    private int id;
    @Getter
    private String name;

    public Station(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ":" + id;
    }
}
