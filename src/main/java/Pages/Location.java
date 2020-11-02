
package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import commons.BasePage;

public class Location extends BasePage {

	public Location(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "#address1")
	WebElement address1;

	@FindBy(css = "#address2")
	WebElement address2;

	@FindBy(css = "#city")
	WebElement city;

	@FindBy(css = "#state")
	WebElement state;

	@FindBy(css = "#postcode")
	WebElement postcode;

	@FindBy(css = "#country")
	WebElement country;

	@FindBy(css = "#submit-btn")
	WebElement submit;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void inputDetailForAddress() {

		address1("67 View St");
		address2("Woollahra");
		city("Sydney");
		state("NSW");
		postcode("2025");
		country("1");
		submit();
	}

	public void address1(String value)
	{
		wait.forElementToBeVisible(address1);
		sendKeys(address1, value);
		lOGGER.info("Entering input into the Adress1 input field");
	}

	public void address2(String value) {
		wait.forElementToBeVisible(address2);
		sendKeys(address2, value);
		lOGGER.info("Entering input into the Adress2 input field");
	}

	public void city(String value) {
		wait.forElementToBeVisible(city);
		sendKeys(city, value);
		lOGGER.info("Entering input into the Town/City input field");
	}

	public void state(String value) {
		wait.forElementToBeVisible(state);
		click(state);
		dropDownMethod(state, "VisibleText", value);
		lOGGER.info("Selecting values from State dropdown field");


	}

	public void postcode(String value) {
		wait.forElementToBeVisible(postcode);
		sendKeys(postcode, value);
		lOGGER.info("Entering input into the Postcode input field");
	}

	public void country(String value) {

		wait.forElementToBeVisible(country);
		click(country);
		dropDownMethod(country, "Value", value);
		lOGGER.info("Selecting values from country dropdown field");

	}

	public void submit() {
		wait.forElementToBeVisible(submit);
		click(submit);
		lOGGER.info("clicking on the Submit button");
	}



}
