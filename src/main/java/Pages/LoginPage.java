package Pages;

import commons.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "div.col-md-12 h1")
    public WebElement loginPageFormTitle;

    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getLoginFormTitle() {
        lOGGER.info("fetching login form title");
        return loginPageFormTitle.getText();
    }
}
