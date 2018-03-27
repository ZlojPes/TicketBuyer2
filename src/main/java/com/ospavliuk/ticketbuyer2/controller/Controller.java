package com.ospavliuk.ticketbuyer2.controller;

import javax.swing.*;

public interface Controller {
    void fromFieldTyping();
    void toFieldTyping();
    void changeDirection();
    void dateChanged();
    void trainNumberSelected();
    void wagonTypeSelected(String button);
    void authSelected();
    void startPressed();
    void passengerEnabled(int num);
    void textfieldFocused(JTextField field);
    void manualPlacesSelected();
    void wagonNumberSelected();
    void exceptWagonSelected();

}
