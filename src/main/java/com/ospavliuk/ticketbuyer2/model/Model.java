package com.ospavliuk.ticketbuyer2.model;

import com.ospavliuk.ticketbuyer2.Gui;
import com.ospavliuk.ticketbuyer2.controller.Controller;

public class Model extends Thread {
    Controller controller;
    Gui gui;

    public Model(Controller controller, Gui gui) {
        this.controller = controller;
        this.gui = gui;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Model is running");
    }

    public void stopModel(){
        System.out.println("Model has been stopped");
    }
}
