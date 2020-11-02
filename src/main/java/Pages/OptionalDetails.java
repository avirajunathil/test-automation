
package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import commons.BasePage;

public class OptionalDetails extends BasePage {


	public OptionalDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "#outcome-field1")
	WebElement resolution;

	@FindBy(css = "#other-outcome1")
	WebElement outcome1;
	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row:nth-child(3) div.col-md-12:nth-child(4) div.document-attachments div.form-group:nth-child(3) div:nth-child(4) label:nth-child(1) > span.btn.btn-default.btn-file")
	WebElement chooseFile;

	@FindBy(css = "#btn-next")
	WebElement doneChoosing;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void resolution() {
		wait.forPage();
		Select ab = new Select(resolution);
		ab.selectByValue("10");
		wait.forPage();
		sendKeys(outcome1, "payment plan");
		wait.forPage();
		click(doneChoosing);

	}
	public void chooseFile() throws AWTException {
		wait.forPage();
		click(chooseFile);
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		StringSelection sc = new StringSelection("C:\\Users\\u39807\\Desktop\\aaaaaaaaaaa.PNG");
		java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.setAutoDelay(5000);

	}



}
