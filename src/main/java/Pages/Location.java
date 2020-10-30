
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

	public void address1() {
		wait.forElementToBeVisible(address1);
		sendKeys(address1, "24/23 zonara street");
	}

	public void address2() {
		wait.forElementToBeVisible(address2);
		sendKeys(address2, "varikuzhi lodge");
	}

	public void city() {
		wait.forElementToBeVisible(city);
		sendKeys(city, "burrywood");
	}

	public void state() {
		wait.forElementToBeVisible(state);
		click(state);
		Select ab = new Select(state);
		ab.selectByValue("8");

	}

	public void postcode() {
		wait.forElementToBeVisible(postcode);
		sendKeys(postcode, "6100");
	}

	public void country() {
		wait.forElementToBeVisible(country);
		Select ab = new Select(country);
		ab.selectByValue("1");

	}

	public void submit() {
		wait.forElementToBeVisible(submit);
		click(submit);
	}
}
