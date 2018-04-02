package com.ospavliuk.ticketbuyer2.controller;

import com.ospavliuk.ticketbuyer2.Gui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ControllerImpl implements Controller {
    private Gui gui;
    private WagonType wagonType;
    private static final Set<Station> stations;

    static {
        stations = new TreeSet<>(Comparator.comparing(Station::getName));
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/src/main/resources/stations.ser"));) {
            stations.addAll((Set<Station>) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public WagonType getWagonType() {
        return wagonType;
    }

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
    public void wagonTypeSelected(WagonType wagonType) {
        this.wagonType = wagonType;
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
