package com.gmail.ziminova.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocationPage extends BasePage {
    private final WebDriver driver;

    private By locationField = By.cssSelector("#city__front-input");
    private By firstLocationField = By.cssSelector(".b-autocomplete-item:first-child");

    public LocationPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void choiceLocation(String text){
        sendKeysByElement(locationField, text);
        clickByElement(firstLocationField);
    }

}
