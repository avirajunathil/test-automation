

package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class EnergyComplaint extends BasePage {


	 public EnergyComplaint(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//i[@class='fa fa-lightbulb-o']")
    WebElement energyComplaint;
	
	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

		public void energyComplaint() {
			wait.forElementToBeVisible(energyComplaint);
	    	click(energyComplaint);
	    }
		
}
