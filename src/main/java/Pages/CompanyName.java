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

	@FindBy(xpath="//ul[@class='dropdown-menumylistolist-0']//*[@class='ui-menu-itemlisting']//*[@class='ui-all']")
	WebElement companyNameSelect;

	@FindBy(xpath = "//BUTTON[@class='btn btn-pagenav btn-block organisation-button']")
	WebElement doneChoosing;

	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void company() {
		companyDetails("Perth Energy");
	}
	    public void companyDetails( String text) {
			wait.forElementToBeVisible(company);
	    	sendKeys(company, text);

	    }

	    public void companyDetailsNeeded(){
			wait.forElementToBeVisible(energyCompanyOption);
			click(energyCompanyOption);
			wait.forElementToBeVisible(companyNameSelect);
			click(companyNameSelect);
			wait.forElementToBeVisible(doneChoosing);
			click(doneChoosing);
		}

}
