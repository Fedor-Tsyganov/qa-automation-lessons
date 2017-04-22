package com.example.model;

import com.example.tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    //@FindBy(css = "")
    //public WebElement pageTopHeader;

    //Elements on the Main page
    @FindBy(css = "#js-fullscreen-hero > div > h1 > span:nth-child(1)")
    public WebElement pageCenterTitlePart1;

    @FindBy(css = "#js-fullscreen-hero > div > h1 > span:nth-child(2)")
    public WebElement pageCenterTitlePart2;

    @FindBy(css = "#js-fullscreen-hero > div > form > div.horus__table > div.horus__table.horus__cell--query > div > div.horus__query-wrap.horus__col > input.input.horus__querytext.js-query-input")
    public WebElement searchField;

    @FindBy(css = "#js-fullscreen-hero > div > form > div.horus__table > div.horus__table.horus__cell--query > div > div.horus__col.horus__col--search > button")
    public WebElement searchButton;

    @FindBy(css = "#js_navigation > div > div:nth-child(1)")
    public WebElement likeButton;

    //dropdown list
    @FindBy(xpath = "//*[@id=\"select-currency\"]")
    public WebElement currencyDropdownList;

    @FindBy(xpath = "//*[@id=\"select-currency\"]/optgroup[1]")
    public List<WebElement> currencyDropdownListTopCurrencies;

    @FindBy(xpath = "//*[@id=\"select-currency\"]/optgroup[2]")
    public List<WebElement> currencyDropdownListAllCurrencies;


    @FindBy(css = "#js_navigation > div > div:nth-child(2) > div > div")
    public WebElement currencyName;

    @FindBy(css = "#js_navigation > div > div:nth-child(2)")
    public WebElement currencyTab;

    @FindBy(css = "#js_navigation > div > div:nth-child(3)")
    public WebElement languageButton;

    @FindBy(css = "#js_navigation > div > div:nth-child(4)")
    public WebElement profileDropdown;

}
