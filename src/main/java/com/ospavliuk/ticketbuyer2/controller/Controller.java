package com.ospavliuk.ticketbuyer2.controller;

import javax.swing.*;

public interface Controller {
    void fromFieldTyping();

    void destFieldTyping();

    void directionChanged();

    void dateChanged();

    void trainNumberSelected(String s);

    void wagonTypeSelected(String button);

    void authSelected(boolean selected);

    void startPressed(String currentLabel);

    void passengerEnabled(int num, boolean enabled);

    void manualPlacesSelected(boolean selected);

    void wagonNumberSelected(boolean selected);

    void exceptWagonSelected(boolean selected);
}
