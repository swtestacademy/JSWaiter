package com.Pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by ONUR on 21.01.2017.
 */
public class Pages extends BasePage {

    public Pages(WebDriver driver) {
        super(driver);
    }

    public HomePage homePage () {
        HomePage homePage = new HomePage(driver);
        return homePage;
    }

}
