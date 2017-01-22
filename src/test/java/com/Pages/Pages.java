package com.Pages;

import com.Utulities.JSWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ONUR on 21.01.2017.
 */
public class Pages extends BasePage {

    public Pages(WebDriver driver) {
        super(driver);
    }

    public HomePage homePage () {
        //Asynchronous wait
        JSWaiter.waitJQueryAngular();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        return homePage;
    }

}
