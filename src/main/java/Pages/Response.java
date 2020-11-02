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

	@FindBy(css = "#contact-title")
	WebElement title;

	@FindBy(css = "#contact-firstname")
	WebElement firstName;

	@FindBy(css = "#contact-lastname")
	WebElement lastname;

	@FindBy(css = "#contact-email")
	WebElement email;

	@FindBy(xpath = "//input[@id='allow_share']//parent::div")
	WebElement ResponseCheckbox2;

	@FindBy(xpath = "//input[@id='contact-me']//parent::div")
	WebElement ResponseCheckbox3;

	@FindBy(xpath = "//button[@id='submit-step']")
	WebElement ResponseSubmit;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public Response(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	    public void title(String value)  {
			scrollToBottom();
			wait.forElementToBeVisible(title);
			dropDownMethod(title, "Value", value);
			lOGGER.info("Selecting values from Title dropdown field");
		}

	public void firstName(String value) {
		scrollToElementView(firstName);
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


	public void clickOnPreferResponse_checkbox2() {

		wait.forElementToBeVisible(ResponseCheckbox2);
		click(ResponseCheckbox2);
		lOGGER.info("Clicking radio Button for Share Experience");

	}

	public void clickOnPreferResponse_checkbox3() {

		wait.forElementToBeVisible(ResponseCheckbox3);
		click(ResponseCheckbox3);
		lOGGER.info("Clicking radio button for receiving news and offers");

	}
	public void submit() {

		wait.forElementToBeVisible(ResponseSubmit);
		click(ResponseSubmit);
		lOGGER.info("Clicking radio button for receiving news and offers");

	}
	public void inputResponse()
	{
		title("Mr");
		firstName("User1");
		lastname("Last Name");
		clickOnPreferResponse_checkbox2();
		clickOnPreferResponse_checkbox3();
		submit();
	}

}
