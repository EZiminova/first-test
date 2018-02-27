package com.gmail.ziminova;


import com.gmail.ziminova.pages.LocationPage;
import com.gmail.ziminova.pages.MailPage;
import com.gmail.ziminova.pages.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {
    private static SearchPage searchPage;
    private static MailPage mailPage;

    @BeforeClass
    public void beforeText() throws InterruptedException {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        mailPage = PageFactory.initElements(driver, MailPage.class);
    }

    @Test
    public void CheckUserName(){
        driver.get("https://yandex.by");

        searchPage.enterMail("AutotestUser","AutotestUser123");

        String userNameText = mailPage.getresult();

        Assert.assertEquals(userNameText, "AutotestUser");
    }
}
