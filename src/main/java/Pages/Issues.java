
package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class Issues extends BasePage {

	public Issues(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//LABEL[@for='Need more time to pay'][text()='Need more time to pay']")
	WebElement needMoreTime;

	@FindBy(xpath = "//button[@class='btn btn-pagenav btn-block']")
	WebElement doneChoosing;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void needMoreTime() {
		wait.forElementToBeVisible(needMoreTime);
		click(needMoreTime);
	}

	public void doneChoosing() {
		wait.forElementToBeVisible(doneChoosing);
		click(doneChoosing);
	}
}
