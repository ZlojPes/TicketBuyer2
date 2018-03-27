package com.ospavliuk.ticketbuyer2.controller;

import com.ospavliuk.ticketbuyer2.Gui;

import javax.swing.*;

public class ControllerImpl implements Controller {
    private Gui gui;

    ControllerImpl() {
        gui = new Gui(this);
    }

    public static void main(String[] args) {
        new ControllerImpl();
    }

    @Override
    public void fromFieldTyping() {

    }

    @Override
    public void toFieldTyping() {

    }

    @Override
    public void changeDirection() {

    }

    @Override
    public void dateChanged() {

    }

    @Override
    public void trainNumberSelected() {

    }

    @Override
    public void wagonTypeSelected(String button) {
        gui.print(button);
    }

    @Override
    public void authSelected() {

    }

    @Override
    public void startPressed() {

    }

    @Override
    public void passengerEnabled(int num) {

    }

    @Override
    public void textfieldFocused(JTextField field) {

    }

    @Override
    public void manualPlacesSelected() {

    }

    @Override
    public void wagonNumberSelected() {

    }

    @Override
    public void exceptWagonSelected() {

    }
}
