

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


	@FindBy(xpath = "//input[@id='allow_share']//parent::div")
	WebElement ResponseCheckbox2;

	@FindBy(xpath = "//input[@id='contact-me']//parent::div")
	WebElement ResponseCheckbox3;

	@FindBy(xpath = "//button[@id='submit-step']")
	WebElement ResponseSubmit;

	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());


	public void inputResponse()
	{
		title("Mrs");
		firstName("Peter");
		lastname("Piper");

		clickOnPreferResponse_checkbox2();
		clickOnPreferResponse_checkbox3();
		doneChoosing();


	}


	    public void title(String value)  {

			wait.forElementToBeVisible(title);
			dropDownMethod(title, "Value", value);         // new method
			lOGGER.info("Selecting values from Title dropdown field");
		}

	public void firstName(String value) {
		wait.forElementToBeVisible(firstName);
		sendKeys(firstName, value);
		lOGGER.info("Entering input into the Prefer response First Name input field");
	}

	public void lastname(String value) {
		wait.forElementToBeVisible(lastname);
		sendKeys(lastname, value);
		lOGGER.info("Entering input into the Prefer response Last Name input field");

	}

	    public void email(String username1) throws IOException {
			Properties property = new Properties();
			String pathToTestData = System.getProperty("user.dir") + "\\env\\stagging.properties";
			property.load(new FileInputStream(pathToTestData));
			wait.forElementToBeVisible(email);
			property.getProperty("username1");
			sendKeys(email, username1);
	    }

	public void post() {
		wait.forElementToBeVisible(post);
		click(post);
	}

	public void option2() {
		wait.forElementToBeVisible(option2);
		click(option2);
	}

	public void option3() {
		wait.forElementToBeVisible(option3);
		click(option3);
	}

	public void doneChoosing() {
		wait.forElementToBeVisible(doneChoosing);
		click(doneChoosing);
	}

	public  void clickOnPreferResponse_checkbox2() {

		wait.forElementToBeVisible(ResponseCheckbox2);
		click(ResponseCheckbox2);
		lOGGER.info("Clicking radio Button for Share Expericence");


	}

	public  void clickOnPreferResponse_checkbox3() {

		wait.forElementToBeVisible(ResponseCheckbox3);
		click(ResponseCheckbox3);
		lOGGER.info("Clicking radio button for receiving news and offers");

	}
	public  void sunmit() {

		wait.forElementToBeVisible(ResponseSubmit);
		click(ResponseSubmit);
		lOGGER.info("Clicking radio button for receiving news and offers");

	}

}
