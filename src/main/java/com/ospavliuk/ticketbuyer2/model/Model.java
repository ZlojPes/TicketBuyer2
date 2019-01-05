package com.ospavliuk.ticketbuyer2.model;

import com.ospavliuk.ticketbuyer2.Gui;
import com.ospavliuk.ticketbuyer2.controller.Controller;

import java.nio.file.Paths;

public class Model extends Thread {
    private final Controller controller;
    private final Gui gui;

    public Model(Controller controller, Gui gui) {
        this.controller = controller;
        this.gui = gui;

        String pathToEdgeDriver = Paths.get(".\\src\\main\\resources\\MicrosoftWebDriver.exe").toAbsolutePath().normalize().toString();
        System.setProperty("webdriver.edge.driver", pathToEdgeDriver);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Model is running");
        System.out.println("Current web browser is " + gui.getWebDriverType());
    }

    public void stopModel() {
        System.out.println("Model has been stopped");
    }
}
