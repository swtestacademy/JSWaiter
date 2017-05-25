package pages;

import org.openqa.selenium.By;
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

    @FindBy(how = How.XPATH, using = "//a[contains(.,'ÜYE GİRİŞİ')]")
    public WebElement loginButton;

    /*public void hoverRecruiterAccount(){
        hoverByAction(recruiter);
    }*/

    public void closePopupIfExists () throws InterruptedException {handlePopup(By.cssSelector(".ui-dialog-titlebar-close"));}

    public void openHomePage (){
        driver.navigate().to("http://www.kariyer.net/");
    }

    public void printTitle() {
        System.out.println("Page title is: " + driver.getTitle());
    }

    public void clickLogin () {click(loginButton);}
}
