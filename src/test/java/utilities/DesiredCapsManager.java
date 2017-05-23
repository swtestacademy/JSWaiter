package utilities;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by onurb on 19-Dec-16.
 */
public class DesiredCapsManager {

    public DesiredCapabilities getDesiredCapabilities (String browser, String platform) {
        //Set DesiredCapabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();

        //Firefox Profile Settings
        if (browser.equals("firefox")) {
            setFirefoxCaps(capabilities);
        } else if(browser.equals("chrome")) {
            setChromeCaps(capabilities);
        }

        //Set Platform
        capabilities.setCapability("platform", platform);
        //Set BrowserName
        capabilities.setCapability("browserName", browser);
        //Return Capabilities
        return capabilities;
    }

    //Set Firefox Capabilities
    private void setFirefoxCaps (DesiredCapabilities capabilities) {
        FirefoxProfile profile = new FirefoxProfile();
        //Accept Untrusted Certificates
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(false);
        //Use No Proxy Settings
        profile.setPreference("network.proxy.type", 0);
        //Set Firefox profile to capabilities
        capabilities.setCapability(FirefoxDriver.PROFILE, profile);
    }

    public void setChromeCaps (DesiredCapabilities capabilities) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("disable-popup-blocking");
        options.addArguments("ignore-certificate-errors");
        options.addArguments("disable-translate");
        options.addArguments("start-maximized");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    }
}
