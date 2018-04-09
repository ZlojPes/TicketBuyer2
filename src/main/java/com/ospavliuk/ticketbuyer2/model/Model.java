package com.ospavliuk.ticketbuyer2.model;

import com.ospavliuk.ticketbuyer2.Gui;
import com.ospavliuk.ticketbuyer2.controller.Controller;
import org.openqa.selenium.WebDriver;

public class Model extends Thread {
    private final Controller controller;
    private final Gui gui;
    private final WebDriver webDriver;

    public Model(Controller controller, Gui gui, WebDriver webDriver) {
        this.controller = controller;
        this.gui = gui;
        this.webDriver = webDriver;
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
