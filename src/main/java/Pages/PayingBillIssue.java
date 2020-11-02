package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class PayingBillIssue extends BasePage {


	 public PayingBillIssue(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//LABEL[@for='Paying a bill'][text()='Paying a bill']")
    WebElement payingBill;
	
	@FindBy(xpath = "//button[@class='btn btn-pagenav btn-block']")
    WebElement doneChoosing;
	    
	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

		public void payingBill() {
			wait.forElementToBeVisible(payingBill);
	    	click(payingBill);
			lOGGER.info("clicked on bill pay option");

		}
		public void doneChoosing() {
			wait.forElementToBeVisible(doneChoosing);
	    	click(doneChoosing);
			lOGGER.info("clicked on done choosing");

		}
}
