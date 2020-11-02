
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

	@FindBy(xpath = "//button[@id='submit-btn']")
	WebElement submit;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void address1Details() {
		address1details("24/23 zonara street");
		address2details("varikuzhi lodge");
		cityDetails("burrywood");
		stateSelect("8");
		postalcode("6100");
		stateCountry("1");
	}


	public void address1details( String text) {
		wait.forElementToBeVisible(address2);
		sendKeys(address2, text);
	}
	public void address2details( String text) {
		wait.forElementToBeVisible(address1);
		sendKeys(address1, text);
	}
	public void cityDetails( String text) {
		wait.forElementToBeVisible(city);
		sendKeys(city, text);
	}

	public void stateSelect(String value){
		wait.forElementToBeVisible(state);
		dropDownMethod(state, "Index", value );

	}
	public void postalcode( String postalcode) {
		wait.forElementToBeVisible(postcode);
		sendKeys(postcode, postalcode);
	}
	public void stateCountry(String value){
		wait.forElementToBeVisible(country);
		dropDownMethod(country, "Index", value );

	}

	public void doneChoosing(){
		wait.forElementToBeVisible(submit);
		click(submit);
	}



}
