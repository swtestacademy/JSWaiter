package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.Pages;
import utilities.DesiredCapsManager;
import utilities.DriverManager;
import utilities.JSWaiter;

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
    @BeforeMethod
    @Parameters(value={"browser","platform"})
    public void setupTest (@Optional String browser, @Optional String platform) throws MalformedURLException {
        System.out.println("Browser: " + browser);
        System.out.println("Platform: " + platform);

        //Get DesiredCapabilities
        DesiredCapabilities capabilities = desiredCapsManager.getDesiredCapabilities(browser,platform);
        //Create Driver with capabilities
        driver = new DriverManager(capabilities, browser).createDriver();
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
