import Pages.LoginDetails;
import Pages.CompanyName;
import Pages.EnergyComplaint;
import Pages.Feel;
import Pages.HomePage;
import Pages.Issues;
import Pages.Location;
import Pages.LoginPage;
import Pages.OptionalDetails;
import Pages.PayingBillIssue;
import Pages.Response;
import Pages.SignUp;
import Pages.SubmitNewComplaint;
import commons.TestBase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static commons.Configuration.url;
import static commons.Configuration.username;

import java.io.*;
import java.awt.AWTException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
		EnergyComplaint energyComplaint = new EnergyComplaint(driver);
		energyComplaint.energyComplaint();
		PayingBillIssue payingBillIssue = new PayingBillIssue(driver);
		payingBillIssue.payingBill();
		payingBillIssue.doneChoosing();
		Issues issue = new Issues(driver);
		issue.needMoreTime();
		issue.doneChoosing();
		Feel feel = new Feel(driver);
		feel.disappointed();
		feel.doneChoosing();
		Location location = new Location(driver);
		location.address1();
		location.address2();
		location.city();
		location.state();
		location.postcode();
		location.country();
		location.submit();
		CompanyName companyName = new CompanyName(driver);
		companyName.company();
		companyName.clickOnEnergyCompanyOption();
		companyName.companyName();
		companyName.doneChoosing();
		OptionalDetails optionalDetails = new OptionalDetails(driver);
		optionalDetails.resolution();
		optionalDetails.outcome1();
		optionalDetails.chooseFile();
		optionalDetails.doneChoosing();
		Response response = new Response(driver);
		response.title();
		response.firstName();
		response.lastname();
		response.email(property.getProperty("username1"));
		response.post();
		response.option2();
		response.option3();
		response.doneChoosing();


	}

}
