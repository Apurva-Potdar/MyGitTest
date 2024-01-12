package coverFoxTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import coverFoxUsingTestNG.CoverFoxAddressDetails;
import coverFoxUsingTestNG.CoverFoxHealthPlan;
import coverFoxUsingTestNG.CoverFoxHome;
import coverFoxUsingTestNG.CoverFoxMemberDetail;
import coverFoxUsingTestNG.HealthPlan;

import org.openqa.selenium.edge.EdgeDriver;


public class CF_TC555_Validate_search_results_for_healthcare_policies {
	WebDriver driver;
	CoverFoxHome home;
	CoverFoxHealthPlan health;
	CoverFoxMemberDetail memberDetails;
	CoverFoxAddressDetails addressDetails;
	HealthPlan plan;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
	driver= new EdgeDriver();
	home= new CoverFoxHome(driver);
	health = new CoverFoxHealthPlan(driver);
	memberDetails = new CoverFoxMemberDetail(driver);
	addressDetails = new CoverFoxAddressDetails(driver);
	plan= new HealthPlan(driver);
	
	Reporter.log("launching browser", true);
	driver.manage().window().maximize();
	driver.get("https://www.coverfox.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		}
	
	@BeforeMethod
	public void addDetails() throws InterruptedException
	{
		Reporter.log("clicking on female gender", true);
		home.clickOnFemaleRadioButton();
		Thread.sleep(2000);
		
		Reporter.log("selecting dependent in the health plan ", true);
		health.selectHusband();
		health.selectDaughter();
		health.clickOnButton();
		Thread.sleep(2000);
		
		Reporter.log("send the age of self and dependent ", true);
		memberDetails.myAgeSelect("27");
		memberDetails.daughterAgeSelect("1");
		memberDetails.spouseAgeSelect("29");
		memberDetails.clickOnButton();
		
		Reporter.log("select the pin and mobile no", true);
		addressDetails.sendPinCodeNo("411023");
		addressDetails.sendMobileNo("8421526902");
		addressDetails.clickOnContinueButton();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void result()
	{
		Reporter.log("value return from the text", true);
		int NoFromText = plan.availablePlanFromText();
		int NoFromBanner = plan.availablePlanFromBanners();
		
		Assert.assertEquals(NoFromText, NoFromBanner,"Text results are not matching with Banner results, TC is failed");
	}
	
	
	
	
	@AfterMethod
  public void closingBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
  }
}
