package com.gmail.ziminova;

import com.gmail.ziminova.pages.LocationPage;
import com.gmail.ziminova.pages.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest extends BaseTest{

    private static SearchPage searchPage;
    private static LocationPage locationPage;

    @BeforeClass
    public void beforeText() throws InterruptedException {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        locationPage = PageFactory.initElements(driver, LocationPage.class);
    }

    /*@Test
    public void CheckValue() throws InterruptedException {
        driver.get("https://ya.ru");

        searchPage.search("Прогноз погоды на неделю");
       Assert.assertEquals("Погода в Пензе", searchPage.getResult());

    }*/

    @Test
    public void equalContents (){
        driver.get("https://yandex.ru");

        searchPage.changeOfLocation();
        locationPage.choiceLocation("Лондон");
        String textMore1 = searchPage.saveContentsItem();

        searchPage.changeOfLocation();
        locationPage.choiceLocation("Милан");
        String textMore2 = searchPage.saveContentsItem();

        Assert.assertEquals(textMore1, textMore2);

    }

}
