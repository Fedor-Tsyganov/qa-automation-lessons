package com.example.tests;

import com.example.model.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;


public class MainPageTest extends BaseTest {

    private MainPage mainPage;

    @BeforeTest
    void setupTest() throws InterruptedException {
        driverChrome.get("https://www.trivago.com/");
        Thread.sleep(1000);
        mainPage = PageFactory.initElements(driverChrome, MainPage.class);
    }

    @Test
    void verifyTopHeaderIsPresent() {
        Assert.assertTrue(mainPage.pageCenterTitlePart1.isDisplayed());
    }

    @Test
    void verifyTopHeaderText() {
        String textToCheck = mainPage.pageCenterTitlePart1.getText() + " " + mainPage.pageCenterTitlePart2.getText();
        for (String s : "Find your ideal hotel for the best price".split("\\s+")) {
            //Splitting string into words and checking if each word is present
            Assert.assertTrue(textToCheck.contains(s));
        }
    }

    /*
    @Test
    void verifyCenterTitleIsPresent(){}

    @Test
    void verifySearchButtonIsPresent(){}

    @Test
    void verifySearchFieldIsPresent(){}

    @Test
    void verifyLikeButtonIsPresent(){}

    @Test
    void verifyCurrencyButtonIsPresent(){}

    @Test
    void verifyLanguageButtonIsPresent(){}

    @Test
    void verifyProfileDropdownIsPresent(){}
    */
}
