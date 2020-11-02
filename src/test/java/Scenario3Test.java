import Pages.LoginDetails;
import Pages.CompanyName;
import Pages.PageFeeling;
import Pages.HomePage;
import Pages.Location;
import Pages.OptionalDetails;
import Pages.Response;
import Pages.SubmitNewComplaint;
import commons.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static commons.Configuration.url;

import java.io.*;
import java.awt.AWTException;
import java.util.Properties;

public class Scenario3Test extends TestBase {

	@BeforeMethod
	public void openPage()  {
		driver.get(url.asString());
	}

	@Test
	public void testHomePage() throws AWTException, InterruptedException, IOException {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnLoginButton();
		Properties property = new Properties();
		String pathToTestData = System.getProperty("user.dir") + "\\env\\stagging.properties";
		property.load(new FileInputStream(pathToTestData));

		LoginDetails login = new LoginDetails(driver);
		login.getUsername(property.getProperty("username1"));
		login.getPassword(property.getProperty("password1"));
		login.onClick();


		SubmitNewComplaint submitNewComplaint = new SubmitNewComplaint(driver);
		submitNewComplaint.submitComplaint();

		PageFeeling feel = new PageFeeling(driver);
		feel.disappointed();

		Location location = new Location(driver);
		location.address1Details();
		location.doneChoosing();

		CompanyName companyName = new CompanyName(driver);
		companyName.company();
		companyName.companyDetailsNeeded();

		OptionalDetails optionalDetails = new OptionalDetails(driver);
		optionalDetails.resolution();
		optionalDetails.chooseFile();

		Response response = new Response(driver);
		response.title();
		response.email(property.getProperty("username1"));

	}

}
