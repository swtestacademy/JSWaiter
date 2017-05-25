package tests;

import utilities.JSWaiter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 21.01.2017.
 */
public class KariyerRecruiterLoginTest extends TestBase {

    @Test
    public void KariyerNetSampleTest() throws Exception {
        System.out.println("Kariyer.net Test Started!");
        //Open pages.pages.HomePage
        pages.homePage().openHomePage();

        //Print Title
        pages.homePage().printTitle();

        //Close Popup If Exists
        pages.homePage().closePopupIfExists();

        //Action to hover Recruiter
        //pages.homePage().hoverRecruiterAccount();

        //Click login button
        pages.homePage().clickLogin();

        JSWaiter.sleep(5000);
        System.out.println("Kariyer.net Test Finished!");
    }
}
