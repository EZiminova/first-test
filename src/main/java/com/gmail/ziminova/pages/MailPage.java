package com.gmail.ziminova.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage extends BasePage {
    private final WebDriver driver;

    private By userNameLabel = By.cssSelector(".mail-User-Name");

    public MailPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getresult(){
        waitForElement(userNameLabel);
        return driver.findElement(userNameLabel).getText();
    }

}
