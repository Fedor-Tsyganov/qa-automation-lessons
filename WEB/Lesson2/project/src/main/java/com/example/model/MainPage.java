package com.example.model;

import com.example.tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

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

    @FindBy(css = "#js_navigation > div > div:nth-child(2)")
    public WebElement currencyButton;

    @FindBy(css = "#js_navigation > div > div:nth-child(3)")
    public WebElement languageButton;

    @FindBy(css = "#js_navigation > div > div:nth-child(4)")
    public WebElement profileDropdown;

}
