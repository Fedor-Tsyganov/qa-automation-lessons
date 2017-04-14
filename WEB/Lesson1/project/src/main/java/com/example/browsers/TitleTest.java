package com.example.browsers;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.example.browsers.SetupTests.driverChrome;
import static com.example.browsers.SetupTests.driverFF;
import static com.example.browsers.SetupTests.driverSafari;

public class TitleTest {

    private final int seconds = 1000;

    @Test
    void testFF(){
        System.out.println(" - ## PROGRAM ##    > running testFF() method");
        driverFF.get("https://yahoo.com");
        driverChrome.findElement(By.cssSelector("#text"));
        Assert.assertEquals("Yahoo", driverFF.getTitle());
        sleep();

    }

    @Test
    void testChrome(){
        System.out.println(" - ## PROGRAM ##    > running testChrome() method");
        driverChrome.get("https://yandex.ru");
        Assert.assertEquals("Яндекс", driverChrome.getTitle());
        sleep();
    }

    @Test
    void testSafari(){
        System.out.println(" - ## PROGRAM ##    > running testSafari() method");
        driverSafari.get("https://google.com");
        Assert.assertEquals("Google", driverSafari.getTitle());
        sleep();
    }


    private void sleep(){
        try {
            Thread.sleep(5 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
