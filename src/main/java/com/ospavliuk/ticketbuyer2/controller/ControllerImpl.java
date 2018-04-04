package com.ospavliuk.ticketbuyer2.controller;

import com.ospavliuk.ticketbuyer2.Gui;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;

public class ControllerImpl implements Controller {
    private Gui gui;
    private WagonType wagonType;
    private static final Set<Station> stations;
    private int fromStation;
    private int destStation;

    static {
        stations = new TreeSet<>(Comparator.comparing(Station::getName));
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/resources/stations.ser"));) {
            Object o = ois.readObject();
            Set stationSet = null;
            if (o instanceof Set) {
                stationSet = (Set) o;
            }
            if (stationSet != null) {
                for (Object s : stationSet) {
                    if (s instanceof Station) {
                        stations.add((Station) s);
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public WagonType getWagonType() {
        return wagonType;
    }

    private ControllerImpl() {
        gui = new Gui(this);
//        stations.forEach(System.out::println);
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
        gui.changeDirection();
        System.out.println(fromStation + " ; " + destStation);
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
        List<Station> out = new ArrayList<>();
        stations.stream().filter(station -> station.getName().startsWith(typedText)).forEach(out::add);
        return out;
    }

    @Override
    public void setStation(int stationId, boolean isStartStation) {
        if (isStartStation) {
            fromStation = stationId;
        } else {
            destStation = stationId;
        }
        Color color = stationId == 0 ? Color.RED : Color.GREEN.darker();
        gui.setStationColor(isStartStation, color);
        gui.setChangeButtonEnabled(fromStation != 0 && destStation != 0);
    }
}
