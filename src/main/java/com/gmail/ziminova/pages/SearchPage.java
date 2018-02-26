package com.gmail.ziminova.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{
    private final WebDriver driver;

    private By entrySearchField = By.cssSelector("#text");
    private By searchButton = By.cssSelector(".button");
    private By searchResult = By.cssSelector("[href=\"https://yandex.ru/pogoda/penza?from=serp_title\"]");
    private By positionClick = By.cssSelector(".geolink__reg");
    private By itemButton = By.cssSelector(".home-link.home-link_blue_yes.home-tabs__link.home-tabs__more-switcher");
    private By itemResult = By.cssSelector(".home-tabs__more");

    public SearchPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void search(String text){
        sendKeysByElement(entrySearchField, text);
        clickByElement(searchButton);
    }

    public void changeOfLocation(){
        clickByElement(positionClick);
    }

    public String saveContentsItem(){
        clickByElement(itemButton);
        return getResult(itemResult);
    }

    public  String getResult(By locator){
        return driver.findElement(locator).getText();
    }
}
