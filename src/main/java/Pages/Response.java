

package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import commons.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Response extends BasePage {


	 public Response(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = "#contact-title")
    WebElement title;
	
	@FindBy(css = "#contact-firstname")
	WebElement firstName;

	@FindBy(css = "#contact-lastname")
	WebElement lastname;
	
	@FindBy(css = "#contact-email")
	WebElement email;
    
	@FindBy(xpath = "//label[contains(text(),'Post')]")
	WebElement post;
	
	@FindBy(xpath = "//*[contains(text(), 'I would like to share my experience with others to improve awareness and outcomes.')]\n")
	WebElement option2;
	
	@FindBy(xpath = "//*[contains(text(), 'I would like to receive news and offers from Handle My Complaint')]\n")
	WebElement option3;
	
	@FindBy(css = "#submit-step")
	WebElement doneChoosing;

	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	    public void title() throws IOException {
			wait.forElementToBeVisible(title);
	    	Select ab = new Select(title);
	    	ab.selectByValue("Mr");
			wait.forElementToBeVisible(firstName);
			sendKeys(firstName, "Roshan");
			wait.forElementToBeVisible(lastname);
			sendKeys(lastname, "Singh");

			wait.forElementToBeVisible(post);
			click(post);
			wait.forElementToBeVisible(option2);
			click(option2);
			wait.forElementToBeVisible(option3);
			click(option3);
			wait.forElementToBeVisible(doneChoosing);
			click(doneChoosing);
	    	
	    }
		
	    public void email(String username1) {
			wait.forElementToBeVisible(email);
			sendKeys(email, username1);
	    }

}
