package com.kodilla.testing2.google.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {

    public final static String FIREFOX = "FIREFOX DRIVER";
    public final static String CHROME = "CHROME DRIVER";
    public final static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if(driver.equals(FIREFOX)){
            return  new FirefoxDriver();
        }else if (driver.equals(CHROME)) {
            return new ChromeDriver();
        }else {
            return null;
        }

    }
}
