package com;

import com.Utulities.JSWaiter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 21.01.2017.
 */
public class HepsiBuradaTest extends TestBase {

    @Test
    public void HBSampleTest () throws Exception {
        System.out.println("HB Test Started!");
        //Open HomePage
        pages.homePage().openHomePage();

        //Print Title
        pages.homePage().printTitle();

        //Action to hover myAccount
        pages.homePage().gotoMyAccount();

        //Click login button
        pages.clickBy(By.id("login"));
    }
}
