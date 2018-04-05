package com.ospavliuk.ticketbuyer2.controller;

import com.ospavliuk.ticketbuyer2.Gui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.List;

public class ControllerImpl implements Controller {
    private Gui gui;
    private WagonType wagonType;
    private static final Set<Station> stations;
    private int startStation, destStation;
    private int day, month, year;
    private String time;

    static {
        stations = new TreeSet<>(Comparator.comparing(Station::getName));
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/resources/stations.ser"))) {
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

    private ControllerImpl() {
        gui = new Gui(this);
    }

    public static void main(String[] args) {
        new ControllerImpl();
    }

    @Override
    public void directionChanged() {
        gui.changeDirection();
    }

    @Override
    public boolean setDate(int day, int month, int year, String time) {
        if (day == 0 || month == 0) {
            return false;
        }
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
        System.out.println(this.day + "-" + this.month + "-" + this.year + "-" + this.time);
        return true;
    }

    @Override
    public void trainNumberSelected(String s) {
        gui.setTrainNumberFieldEnabled(s.equals("Задать"));
    }

    @Override
    public void setWagonType(WagonType wagonType) {
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
    public List<String> findStation(String typedText) {
        List<String> out = new ArrayList<>();
        stations.stream().
                filter(station -> station.
                        getName().
                        startsWith(typedText)).
                forEach(station -> out.add(station.getName()));
        return out;
    }

    @Override
    public boolean tryToSetStation(String name, boolean isStartStation) {
        for (Station station : stations) {
            if (station.getName().equals(name)) {
                if (isStartStation) {
                    startStation = station.getId();
                } else {
                    destStation = station.getId();
                }
                gui.setChangeButtonEnabled(startStation != 0 && destStation != 0);
                return true;
            }
        }
        gui.setChangeButtonEnabled(false);
        return false;
    }

//    public WagonType getWagonType() {
//        return wagonType;
//    }
}
