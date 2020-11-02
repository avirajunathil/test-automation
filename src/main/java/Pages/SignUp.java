package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import commons.BasePage;

public class SignUp extends BasePage {


	 public SignUp(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		@FindBy(xpath = "//input[@id='register-title']")
	    WebElement title;
	    
	    @FindBy(xpath = "//input[@id='register-givenname']")
	    WebElement firstName;
	    
	    @FindBy(xpath = "//input[@id='register-familyname']")
	    WebElement lastName;
	    
	    @FindBy(xpath = "//input[@id='register-email']")
	    WebElement email;
	    
	    @FindBy(xpath = "//input[@id='register-password']")
	    WebElement password;
	    
	    @FindBy(xpath = "//input[@id='newcomplaintuser-password-confirm']")
	    WebElement newPassword;
	   
	    @FindBy(xpath = "//input[@id='newcomplaintuser-signup']")
	    WebElement checkbox;
	  
	    @FindBy(css = "#LoginButton")
	    WebElement SignUpButton;
	    
	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

		public void getTitle() {
			wait.forElementToBeVisible(title);
	    	click(title);
	    	Select ob = new Select(title);
	    	ob.selectByValue("Ms");
	    }
	    
		 public void firstName() {
			wait.forElementToBeVisible(firstName);
			sendKeys(firstName, "TestUser");
		    }
		    
	    public void lastName() {
			wait.forElementToBeVisible(lastName);
			sendKeys(lastName, "abc");
	    }
	    
	    public void password() {
	    	wait.forPage();
			wait.forElementToBeVisible(password);
	    	sendKeys(password, "TestUser");
	    }
	    
	    public void newPassword() {
			wait.forElementToBeVisible(newPassword);
	    	sendKeys(newPassword, "TestUser");
	    }

	    public void checkbox() {
			wait.forElementToBeVisible(checkbox);
	    	click(checkbox);	
	    	
	    }
	    public void SignUpButton() {
			wait.forElementToBeVisible(SignUpButton);
	    	click(SignUpButton);	
	    	
	    }
	    
	
}
