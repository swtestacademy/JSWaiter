package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import sun.security.krb5.internal.crypto.Des;

/**
 * Created by onurb on 25-May-17.
 */
public class DriverManager {

    public DesiredCapabilities caps = null;
    public String browser = null;
    public WebDriver driver = null;

    public DriverManager(DesiredCapabilities capabilities, String browser) {
        this.caps = capabilities;
        this.browser = browser;
    }

    public WebDriver createDriver () {
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver(caps);
        } else if (browser.equals("chrome")) {
            driver = new ChromeDriver(caps);
        } else {
            Assert.assertTrue(false);
        }
        return driver;
    }
}
