package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static com.example.model.Constants.*;

public class BaseTest {

    public static WebDriver driverChrome;

    @BeforeSuite
    public void setupEnvironment(){
        System.setProperty(CHROME_DRIVER, PATH_TO_CHROME_DRIVER);
        driverChrome = new ChromeDriver();
    }

    @AfterSuite
    void tearDown() throws InterruptedException {
        driverChrome.close();
    }

}
