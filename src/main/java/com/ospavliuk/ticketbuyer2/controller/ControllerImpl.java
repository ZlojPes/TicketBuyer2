package com.ospavliuk.ticketbuyer2.controller;

import com.ospavliuk.ticketbuyer2.Gui;

import java.util.List;

public class ControllerImpl implements Controller {
    private Gui gui;

    private ControllerImpl() {
        gui = new Gui(this);
    }

    public static void main(String[] args) {
        new ControllerImpl();
    }

    @Override
    public void fromFieldTyping() {

    }

    @Override
    public void destFieldTyping() {

    }

    @Override
    public void directionChanged() {

    }

    @Override
    public void dateChanged() {

    }

    @Override
    public void trainNumberSelected(String s) {
        gui.setTrainNumberFieldEnabled(s.equals("Задать"));
    }

    @Override
    public void wagonTypeSelected(String button) {
        if (button.equals("Плацкарт") || button.equals("Любой")) {

        }
    }

    @Override
    public void authSelected(boolean selected) {
        gui.setAuthFieldsSelected(selected);
    }

    @Override
    public void startPressed(String currentLabel) {
        String out;
        if (currentLabel.equals("СТАРТ")) {
            out = "СТОП";
        } else {
            out = "СТАРТ";
        }
        gui.setStartButtonLabel(out);
    }

    @Override
    public void passengerEnabled(int num, boolean enable) {
        gui.enablePassenger(num, enable);
    }

    @Override
    public void manualPlacesSelected(boolean selected) {
        gui.setPlacesEnabled(selected);
    }

    @Override
    public void wagonNumberSelected(boolean enable) {
        gui.setWagonOnlyFieldEnabled(enable);
    }

    @Override
    public void exceptWagonSelected(boolean selected) {
        gui.setWagonExceptFieldEnabled(selected);
    }

    @Override
    public List<Station> findStation(String typedText) {
        return null;
    }
}
