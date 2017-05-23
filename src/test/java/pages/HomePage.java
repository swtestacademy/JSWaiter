package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ONUR on 21.01.2017.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(.,'İŞVEREN')]")
    public WebElement recruiter;

    public void hoverRecruiterAccount(){
        hoverByAction(recruiter);
    }

    public void openHomePage (){
        driver.navigate().to("http://www.kariyer.net/");
    }

    public void printTitle() {
        System.out.println("HB Test's pages.pages title is: " + driver.getTitle());
    }
}
