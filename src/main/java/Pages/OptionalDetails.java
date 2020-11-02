
package Pages;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import commons.BasePage;
import org.testng.Assert;

public class OptionalDetails extends BasePage {

	@FindBy(xpath = "//span[@class='btn btn-default btn-file']")
	WebElement chooseFile;


	@FindBy(css = "#btn-next")
	WebElement doneChoosing;

	// Optional details
	@FindBy(xpath = "//select[@id='impact-field']")
	 WebElement dropDown_EffectOfIssue;

	@FindBy(xpath = "//select[@class='form-control' and @name='outcome1']")
	 WebElement dropDown_ResolutionIWant;

	@FindBy(xpath = "//select[@id='outcome-field2']")
	 WebElement dropDown_2ndPriority;

	@FindBy(xpath = "//select[@id='outcome-field3']")
	 WebElement dropDown_3rdPriority;

	@FindBy(xpath = "//select[@id='contactattempts-field']")
	 WebElement dropDown_ContactAttempt;

	@FindBy(xpath = "//select[@id='experience-field2']")
	 WebElement dropDown_YourExperience;

	@FindBy(xpath = "//input[@id='referencenumber-field']")
	 WebElement Textbox_AddRefrence;

	@FindBy(xpath = "//input[@id='accountnumber-field']")
	 WebElement Textbox_AccountNumber;

	@FindBy(xpath = "//textarea[@id='comments-field']")
	 WebElement Textbox_DescriptionBox;

	@FindBy(xpath = "//button[@id='btn-next']")
	 WebElement optionalDetails_SubmitButton;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public OptionalDetails(WebDriver driver) {
		super(driver);
	}

	public void chooseFile() throws AWTException {
		wait.forElementToBeVisible(chooseFile);
		click(chooseFile);
		String projectpath = System.getProperty("user.dir") + File.separator + "simple.PNG";

		Robot robot = new Robot();
		robot.delay(2000);
		StringSelection stringSelection = new StringSelection(projectpath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER)	;

		if (driver.findElement(By.xpath("//SPAN[@class='file-name'][text()='simple.PNG']")).isDisplayed()) {
			Assert.assertTrue(true, "Profile picture is Uploaded");
		} else {
			Assert.assertTrue(false, "Profile picture not Uploaded");
		}
	}

	public void doneChoosing() {
		wait.forElementToBeVisible(doneChoosing);
		click(doneChoosing);
	}

	public void EffectofIssue(String value) {

		wait.forElementToBeVisible(dropDown_EffectOfIssue);
		dropDownMethod(dropDown_EffectOfIssue, "VisibleText", value);
		lOGGER.info("Selecting values from What's the Effect of Issue dropdown field");

	}

	public void ResolutionIWant(String value) {

		wait.forElementToBeVisible(dropDown_ResolutionIWant);
		dropDownMethod(dropDown_ResolutionIWant, "VisibleText", value);
		lOGGER.info("Selecting values from resoltion i most want  dropdown field\"");

	}

	public void SecondPriority(String value) {

		wait.forElementToBeVisible(dropDown_2ndPriority);
		dropDownMethod(dropDown_2ndPriority, "VisibleText", value);
		lOGGER.info("Selecting values from Second Priority dropdown field");


	}

	public void ThirdPriority(String value) {

		wait.forElementToBeVisible(dropDown_3rdPriority);
		dropDownMethod(dropDown_3rdPriority, "VisibleText", value);
		lOGGER.info("Selecting values from Third dropdown field");

	}

	public void NumberOfContactAtempts(String value) {

		wait.forElementToBeVisible(dropDown_ContactAttempt);
		dropDownMethod(dropDown_ContactAttempt, "VisibleText", value);
		lOGGER.info("Selecting values from Number of contacts attempt dropdown field");

	}

	public void YourExperience(String value) {

		wait.forElementToBeVisible(dropDown_YourExperience);
		dropDownMethod(dropDown_YourExperience, "VisibleText", value);
		lOGGER.info("Selecting values from your experience with staff dropdown field");


	}

	public void AddRefrenceNo(String text) {

		wait.forElementToBeVisible(Textbox_AddRefrence);
		sendKeys(Textbox_AddRefrence , text);
		lOGGER.info("Entering input into the Add refrence number input field");


	}

	public void AddAccountNo(String text) {

		wait.forElementToBeVisible(Textbox_AccountNumber);
		sendKeys(Textbox_AccountNumber , text);
		lOGGER.info("Entering input into the Add Account Number input field");

	}

	public void CommentSection(String text) {

		wait.forElementToBeVisible(Textbox_DescriptionBox);
		sendKeys(Textbox_DescriptionBox , text);
		lOGGER.info("Entering input into the Add Account Number input field");

	}


	public void enterOptionDetails() throws AWTException {
		EffectofIssue("Caused stress / anxiety");
		ResolutionIWant("Amount owed reduced");
		SecondPriority("Manager involvement");
		ThirdPriority("Apology");
		NumberOfContactAtempts("Twice");
		YourExperience("Rude staff");
		AddRefrenceNo("X789");
		AddAccountNo("521678");
		chooseFile();
		CommentSection("One staff member, Ellie, was rude.");
		doneChoosing();

	}
}
