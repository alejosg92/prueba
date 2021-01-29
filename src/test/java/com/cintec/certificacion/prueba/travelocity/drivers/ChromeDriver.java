package com.cintec.certificacion.prueba.travelocity.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChromeDriver {
    private WebDriver driver;
    private static List<ChromeDriver> listChromeDriver = new ArrayList<ChromeDriver>();


    public static ChromeDriver chrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized --disable-infobars --ignore-certificate-errors --disable-extensions --disable-web-security");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        listChromeDriver.add(new ChromeDriver());
        listChromeDriver.get( listChromeDriver.size() - 1).driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        listChromeDriver.get( listChromeDriver.size() - 1).driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        return  listChromeDriver.get( listChromeDriver.size() - 1);

    }

    public WebDriver enLaURL(String url) {
        driver.get(url);
        return  listChromeDriver.get( listChromeDriver.size() - 1).driver;
    }

    public static WebDriver getBrowser() {
        return  listChromeDriver.get( listChromeDriver.size() -1).driver;
    }
}
