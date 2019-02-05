package com.ospavliuk.ticketbuyer2.controller;

import lombok.*;

@AllArgsConstructor
@Getter
public class Passenger {
    private String surName;
    private String name;
    private boolean child;
    private boolean lowPlace;
    @Setter
    private String place;
}
