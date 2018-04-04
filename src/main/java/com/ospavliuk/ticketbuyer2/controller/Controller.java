package com.ospavliuk.ticketbuyer2.controller;

import java.util.List;

public interface Controller {
    void fromFieldTyping();

    void destFieldTyping();

    void directionChanged();

    void dateChanged();

    void trainNumberSelected(String s);

    void wagonTypeSelected(WagonType button);

    void authSelected(boolean selected);

    void startPressed(String currentLabel);

    void passengerEnabled(int num, boolean enabled);

    void manualPlacesSelected(boolean selected);

    void wagonNumberSelected(boolean selected);

    void exceptWagonSelected(boolean selected);

    List<Station> findStation(String typedText);

    void setStation(int stationId, boolean isStartStation);
}
