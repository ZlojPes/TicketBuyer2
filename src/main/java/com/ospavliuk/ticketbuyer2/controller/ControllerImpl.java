package com.ospavliuk.ticketbuyer2.controller;

import com.ospavliuk.ticketbuyer2.Gui;
import com.ospavliuk.ticketbuyer2.model.Model;
import lombok.Getter;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class ControllerImpl implements Controller {
    private Gui gui;
    private WagonType wagonType;
    private static final Set<Station> stations;
    private int day, month, year;
    @Getter
    private String time;
    @Getter
    private int startStation, destStation;
    @Getter
    private List<Passenger> passengerList;
    @Getter
    private boolean running;

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
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
        return day != 0 && month != 0;
    }

    @Override
    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String getDate() {
        return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
    }

    @Override
    public String getChildDate() {
        return (year - 8) + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
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
    public void startStop() {
        String out;
        if (gui.getStsrtbuttonText().equals("СТАРТ")) {
            out = "СТОП";
            gui.setSettingsEnabled(false);
            Model model = new Model(this, gui);
            createPassengerList();
            model.start();
            running = true;
        } else {
            out = "СТАРТ";
            gui.setSettingsEnabled(true);
            running = false;
        }
        gui.setStartButtonLabel(out);
    }

    private void createPassengerList() {
        JCheckBox[] passengerBoxes = gui.getPassengerBoxes();
        JTextField[] surNameFields = gui.getSurNameFields();
        JTextField[] nameFields = gui.getNameFields();
        JCheckBox[] lowSeatBoxes = gui.getLowSeatBoxes();
        JCheckBox[] childBoxes = gui.getChildBoxes();
        JTextField[] placeFields = gui.getPlaceFields();
        List<Passenger> passengerList = new ArrayList<>();
        for (int i = 0; i < passengerBoxes.length; i++) {
            JCheckBox passengerBox = passengerBoxes[i];
            if (passengerBox.isSelected()) {
                passengerList.add(new Passenger(surNameFields[i].getText(),
                        nameFields[i].getText(),
                        childBoxes[i].isSelected(),
                        lowSeatBoxes[i].isSelected(),
                        placeFields[i].getText())
                );
            }
        }
        this.passengerList = passengerList;
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
        if (isStartStation) {
            startStation = 0;
        } else {
            destStation = 0;
        }
        gui.setChangeButtonEnabled(false);
        return false;
    }

    @Override
    public boolean isReady() {
        return (day != 0 && month != 0 && wagonType != null && startStation != 0 && destStation != 0);
    }

    @Override
    public String getSelectedWagonType() {
        String type;
        switch (wagonType) {
            case PLATZKART:
                type = "П";
                break;
            case C1:
                type = "С1";
                break;
            case C2:
                type = "С2";
                break;
            case LUX:
                type = "Л";
                break;
            case KUPE:
                type = "К";
                break;
            case ANY_TYPE:
            default:
                type = "";
        }
        return type;
    }

//    public WagonTypes getWagonType() {
//        return wagonType;
//    }
}
