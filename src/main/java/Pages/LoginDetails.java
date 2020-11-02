package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class LoginDetails extends BasePage{


		@FindBy(xpath = "//input[@id='register-email']")
	    WebElement username;
	    
	    @FindBy(xpath = "//input[@id='register-password']")
	    WebElement password;
	    
	    @FindBy(css = "#LoginButton")
	    WebElement Click;
	    
	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

		public LoginDetails(WebDriver driver) {
			super(driver);		}
		
		public void getUsername(String username1) {
			wait.forElementToBeVisible(username);
	    	sendKeys(username, username1);
			lOGGER.info("User name entered");

		}
	    
	    public void getPassword(String password1) {
			wait.forElementToBeVisible(password);
	    	sendKeys(password, password1);
			lOGGER.info("Password entered");

		}
	    public void onClick() {
			wait.forElementToBeVisible(Click);
	    	click(Click);
			lOGGER.info("clicked on done button of login page");


		}
	    
	
}
