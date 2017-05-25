package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Pages;
import utilities.DesiredCapsManager;
import utilities.JSWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.util.List;

import static utilities.JSWaiter.sleep;

/**
 * Created by ONUR on 21.01.2017.
 */
public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private DesiredCapsManager desiredCapsManager = new DesiredCapsManager();
    Pages pages;

    //Do the test setup
    @BeforeMethod
    @Parameters(value={"browser","platform"})
    public void setupTest (@Optional String browser, @Optional String platform) throws MalformedURLException {
        browser="chrome";
        platform="WINDOWS";
        //Get DesiredCapabilities
        DesiredCapabilities capabilities = desiredCapsManager.getDesiredCapabilities(browser,platform);
        //Create Driver with capabilities
        driver = new ChromeDriver(capabilities);
        //Send driver object to JSWaiter Class
        JSWaiter.setDriver(driver);
        //This is the default wait for Explicit Waits
        wait = new WebDriverWait(driver,15);
        //Create pages.pages object
        pages = new Pages(driver);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
