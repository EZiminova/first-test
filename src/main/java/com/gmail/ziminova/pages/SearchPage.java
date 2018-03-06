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
    private By loginField = By.cssSelector("[placeholder=Логин]");
    private By passwordField = By.cssSelector("[placeholder=Пароль]");
    private By enterMailButon = By.cssSelector(".auth__button");

    public SearchPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterMail(String login, String password){
        sendKeysByElement(loginField, login);
        sendKeysByElement(passwordField, password);
        clickByElement(enterMailButon);
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
