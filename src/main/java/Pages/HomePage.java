package Pages;

import commons.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	
    @FindBy(css = ".col-md-12.text-center>a:nth-of-type(1)")
    WebElement signUpButton;

    @FindBy(css = ".col-md-12.text-center>a:nth-of-type(2)")
    WebElement loginButton;

    @FindBy(css = ".col-md-12.text-center>a:nth-of-type(3)")
    WebElement useAsOurGuestLink;

    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignUPButton() {
        wait.forElementToBeVisible(signUpButton);
        click(signUpButton);
        lOGGER.info("clicked on Sign up button");
    }

    public void clickOnLoginButton() {
        wait.forElementToBeVisible(loginButton);
        click(loginButton);
        lOGGER.info("clicked on Login Button");
    }

    public void clickOnUseAsOurGuestLink() {
        wait.forElementToBeVisible(useAsOurGuestLink);
        click(useAsOurGuestLink);
        lOGGER.info("clicked on Use As Our Guest Link Button");
    }
    
    
    
}
