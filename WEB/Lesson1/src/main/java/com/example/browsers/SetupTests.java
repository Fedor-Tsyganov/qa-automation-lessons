package com.example.browsers;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class SetupTests {

    public static WebDriver driverChrome, driverFF, driverSafari;

    @BeforeSuite
    void setupBrowsers(){
        System.out.println(" - ## PROGRAM ##    > running setupBrowsers() method");
        System.setProperty("webdriver.chrome.driver", "/Path/to/chromedriver");
        System.setProperty("webdriver.gecko.driver","/Path/to/FirefoxDriver/geckodriver");

        DesiredCapabilities capChrome = DesiredCapabilities.chrome();
        DesiredCapabilities capFF = DesiredCapabilities.firefox();

        Proxy proxyChrome = new Proxy();
        proxyChrome.setHttpProxy("myhttpproxy:3337");
        capChrome.setCapability("proxy", proxyChrome);

        Proxy proxyFF = new Proxy();
        proxyFF.setHttpProxy("myhttpproxy:3336");
        capFF.setCapability("proxy", proxyFF);

        driverChrome = new ChromeDriver(capChrome);
        driverFF = new FirefoxDriver(capFF);
        driverSafari = new SafariDriver();
    }


    @AfterSuite
    void tearDown(){
        System.out.println(" - ## PROGRAM ##    > running tearDown() method");
        driverChrome.close();
        driverFF.close();
        driverSafari.close();
    }
}
