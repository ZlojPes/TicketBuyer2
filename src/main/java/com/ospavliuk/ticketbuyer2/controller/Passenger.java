package com.ospavliuk.ticketbuyer2.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Passenger {
    private String surName;
    private String name;
    private boolean child;
    private boolean lowPlace;
    private String place;
}
