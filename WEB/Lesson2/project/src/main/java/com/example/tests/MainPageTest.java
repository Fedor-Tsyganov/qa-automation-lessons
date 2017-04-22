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

    @Test(priority = 1)
    void verifyTopHeaderIsPresent() {
        Assert.assertTrue(mainPage.pageCenterTitlePart1.isDisplayed());
    }

    @Test (priority = 2)
    void verifyTopHeaderText() {
        String textToCheck = mainPage.pageCenterTitlePart1.getText() + " " + mainPage.pageCenterTitlePart2.getText();
        for (String s : "Find your ideal hotel for the best price".split("\\s+")) {
            //Splitting string into words and checking if each word is present
            Assert.assertTrue(textToCheck.contains(s));
        }
    }

    @Test(priority = 3)
    void verifyChangeCurrency() throws InterruptedException {
        String defaultCurrency = "USD";
        String updatedCurrency = "EUR";
        Assert.assertEquals(defaultCurrency, mainPage.currencyName.getText());
        changeCurrency(updatedCurrency);
        Thread.sleep(2000);
        Assert.assertEquals(updatedCurrency, mainPage.currencyName.getText());
    }

    @Test(priority = 4)
    void verifyInvalidSearch() throws InterruptedException {
        searchHotel("asdlkadlnad");
        Thread.sleep(1000);
        Assert.assertTrue(driverChrome.findElement(By.cssSelector("#js-fullscreen-hero > div > form > p")).isDisplayed());
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
    
    void searchHotel(String query){
        mainPage.searchField.sendKeys(query);
        mainPage.searchButton.click();
    }

    void changeCurrency(String currency){
        mainPage.currencyTab.click();
        Select select = new Select(mainPage.currencyDropdownList);
        for (int i = 0; i < select.getOptions().size(); i++){
            if (select.getOptions().get(i).getText().contains(currency)){
                select.getOptions().get(i).click();
                //found item - exit loop
                break;
            }
        }
    }
}
