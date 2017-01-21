package com;

import com.Pages.Pages;
import com.Utulities.DesiredCapsManager;
import com.Utulities.JSWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

/**
 * Created by ONUR on 21.01.2017.
 */
public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private DesiredCapsManager desiredCapsManager = new DesiredCapsManager();
    Pages pages;

    //Do the test setup
    @BeforeClass
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
        //Create Pages object
        pages = new Pages(driver);
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
