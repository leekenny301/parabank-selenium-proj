package com.parabank.setupTearDown;

import com.parabank.drivers.chrome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class setupTearDown {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup(){
        driver = chrome.setDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

}
