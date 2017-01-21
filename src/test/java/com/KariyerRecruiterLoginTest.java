package com;

import com.Utulities.JSWaiter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 21.01.2017.
 */
public class KariyerRecruiterLoginTest extends TestBase {

    @Test
    public void KariyerNetSampleTest() throws Exception {
        System.out.println("Kariyer.net Test Started!");
        //Open HomePage
        pages.homePage().openHomePage();

        //Print Title
        pages.homePage().printTitle();

        //Asynchronous wait
        JSWaiter.waitJQueryAngular();

        //Action to hover Recruiter
        pages.homePage().hoverRecruiterAccount();

        //Click login button
        pages.clickBy(By.xpath("//a[contains(.,'GİRİŞ YAP')]"));

        JSWaiter.sleep(5000);

    }
}
