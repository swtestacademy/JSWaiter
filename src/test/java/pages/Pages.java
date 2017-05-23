package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ONUR on 21.01.2017.
 */
public class Pages extends pages.BasePage {

    public Pages(WebDriver driver) {
        super(driver);
    }

    public pages.HomePage homePage () {
        pages.HomePage homePage = PageFactory.initElements(driver, pages.HomePage.class);
        return homePage;
    }

}
