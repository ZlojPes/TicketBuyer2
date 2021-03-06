package com.ospavliuk.ticketbuyer2.controller;

import java.util.List;

public interface Controller {
    void directionChanged();

    boolean setDate(int day, int month, int year, String time);

    boolean isRunning();

    void setRunning(boolean running);

    String getDate();

    String getChildDate();

    void trainNumberSelected(String s);

    void setWagonType(WagonType button);

    void authSelected(boolean selected);

    void startStop();

    void passengerEnabled(int num, boolean enabled);

    void manualPlacesSelected(boolean selected);

    void wagonNumberSelected(boolean selected);

    void exceptWagonSelected(boolean selected);

    List<String> findStation(String typedText);

    boolean tryToSetStation(String name, boolean isStartStation);

    int getStartStation();

    int getDestStation();

    String getTime();

    String getSelectedWagonType();

    boolean isReady();

    List<Passenger> getPassengerList();
}
