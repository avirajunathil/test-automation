package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

import java.util.List;

public class CompanyName extends BasePage {


	public CompanyName(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//INPUT[@type='text'])[1]")
	WebElement company;


	@FindBy(xpath = "//div[@class='form-group single-org ']")
	WebElement energyCompanyOption;

	@FindBy(xpath = "//a[@class='ui-all']")
	WebElement companyNameSelect;

	@FindBy(xpath = "//BUTTON[@class='btn btn-pagenav btn-block organisation-button']")
	WebElement doneChoosing;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void enterCompanyDetails()
	{
		wait.forElementToBeVisible(company);
		sendKeys(company, "Perth Energy");
		lOGGER.info("clicked on Company Name");
		wait.forElementToBeVisible(energyCompanyOption);
		click(energyCompanyOption);
		lOGGER.info("clicked on Company Name");
		wait.forElementToBeVisible(companyNameSelect);
		click(companyNameSelect);
		lOGGER.info("clicked on Company Name");
		wait.forElementToBeVisible(doneChoosing);
		click(doneChoosing);
		lOGGER.info("clicked on Company Name");

	}
}
