package com.parabank.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {
    public static WebDriver setDriver(){
        return new EdgeDriver();
    }
}
