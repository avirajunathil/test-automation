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

	@FindBy(xpath = "fa fa-lightbulb-o")
	WebElement energyComplaint;

//	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 form.list-form div.check-list:nth-child(3) div.radio > label.checkbox-text.clearfix.radio-label")
//    WebElement billAccount;

	@FindBy(xpath = "//LABEL[@for='Paying a bill'][text()='Paying a bill']")
	WebElement payingBill;

	@FindBy(xpath = "//DIV[@class='container pagenav-container']")
	WebElement doneChoosing;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void submitComplaint() {
		wait.forElementToBeVisible(submitComplaint);
		click(submitComplaint);
	}

	public void energyComplaint() {
		wait.forElementToBeVisible(energyComplaint);
		click(energyComplaint);
	}

	public void payingBill() {
		wait.forElementToBeVisible(payingBill);
		click(payingBill);
	}

	public void doneChoosing() {
		wait.forElementToBeVisible(doneChoosing);
		click(doneChoosing);
	}

}
