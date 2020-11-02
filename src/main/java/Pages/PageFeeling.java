package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class PageFeeling extends BasePage {

	 public PageFeeling(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//label[@for='Disappointed'][text()='Disappointed']")
    WebElement disappointed;
	
	@FindBy(xpath = "//button[@class='btn btn-pagenav btn-block']")
	WebElement doneChoosing;
	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

		public void disappointed() {
	    	wait.forElementToBeVisible(disappointed);
	    	click(disappointed);
			wait.forElementToBeVisible(doneChoosing);
			click(doneChoosing);
	    }


		
}
