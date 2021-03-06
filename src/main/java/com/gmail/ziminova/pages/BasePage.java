package com.gmail.ziminova.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{

    private final WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void waitForElementClickable(By locator){
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void clickByElement(By locator){
        waitForElementClickable(locator);
        driver.findElement(locator).click();
    }

    public void sendKeysByElement(By locator, String text){
        waitForElementClickable(locator);
        clickByElement(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

}
