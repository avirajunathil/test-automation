package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class SubmitNewComplaint extends BasePage {

	public SubmitNewComplaint(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//A[@class='btn btn-primary btn-block new_complaint'][text()='Submit new complaint']")
	WebElement submitComplaint;

	@FindBy(xpath = "//I[@class='fa fa-lightbulb-o']")
	WebElement energyComplaint;

	@FindBy(xpath = "//LABEL[@for='Paying a bill'][text()='Paying a bill']")
	WebElement payingBill;

	@FindBy(xpath = "//button[@class='btn btn-pagenav btn-block']")
	WebElement doneChoosing;

	@FindBy(xpath = "//LABEL[@for='Need more time to pay'][text()='Need more time to pay']")
	WebElement needMoreTime;

	@FindBy(xpath = "//button[@class='btn btn-pagenav btn-block']")
	WebElement doneChoosingOption;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void submitComplaint() {
		wait.forElementToBeVisible(submitComplaint);
		click(submitComplaint);
		wait.forElementToBeVisible(energyComplaint);
		click(energyComplaint);
		wait.forElementToBeVisible(payingBill);
		click(payingBill);
		wait.forElementToBeVisible(doneChoosing);
		click(doneChoosing);
		wait.forElementToBeVisible(needMoreTime);
		click(needMoreTime);
		wait.forElementToBeVisible(doneChoosing);
		click(doneChoosingOption);
	}



}
