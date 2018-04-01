package com.ospavliuk.ticketbuyer2.controller;

import java.io.Serializable;

public class Station implements Serializable {
    private String name;
    private int id;

    public Station(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name +":" + id;
    }
}
