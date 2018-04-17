package com.ospavliuk.ticketbuyer2.model;

import com.ospavliuk.ticketbuyer2.Gui;
import com.ospavliuk.ticketbuyer2.controller.Controller;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Model extends Thread {
    private final Controller controller;
    private final Gui gui;
    private final WebDriver webDriver;

    public Model(Controller controller, Gui gui) {
        this.controller = controller;
        this.gui = gui;

        String pathToEdgeDriver = Paths.get(".\\src\\main\\resources\\MicrosoftWebDriver.exe").toAbsolutePath().normalize().toString();
        System.setProperty("webdriver.edge.driver", pathToEdgeDriver);
        webDriver = new EdgeDriver(DesiredCapabilities.edge());
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Model is running");
        System.out.println("Current web browser is " + gui.getWebDriverType());
    }

    public void stopModel() {
        System.out.println("Model has been stopped");
        webDriver.close();
    }
}
