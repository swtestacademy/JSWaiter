package com.Pages;

import com.Utulities.JSWaiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ONUR on 21.01.2017.
 */
public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void hoverByAction (WebElement element) {
        //Asynchronous wait
        JSWaiter.waitJQueryAngular();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void clickBy (By by) {
        //Asynchronous wait
        JSWaiter.waitJQueryAngular();
        //Explicit wait
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }


}
