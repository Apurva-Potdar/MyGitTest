package myTestNG;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fbPage.BaseClass;
import fbUtility.Utility;
import testNGPOM.FaceBookLoginPage1;
import testNGPOM.FaceBookLoginPage2;

public class Validating_FB_Login extends BaseClass {
	FaceBookLoginPage1 login1;
	FaceBookLoginPage2 login2;
	
	@BeforeClass
	public void launch()
	{
		launchingBrowser();
		login1= new FaceBookLoginPage1(driver);
		login2= new FaceBookLoginPage2(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	}
	
//@AfterClass
//	
//	public void close()
//	{
//	closeBrowser();
//		
//	}
	@BeforeMethod
	
	public void signUpDetails() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login1.clickOnButton();
		
		login2.enterFirstName(Utility.readFromExcel(driver, 0, 0));
		
		login2.enterLastName(Utility.readFromExcel(driver, 0, 1));
		
		login2.enterMobileNo(Utility.readFromExcel(driver, 0, 2));
		login2.enterPassword(Utility.readFromExcel(driver, 0, 3));
		login2.enterday(Utility.readFromExcel(driver, 0, 4));
		login2.entermonth(Utility.readFromExcel(driver, 0, 5));
		login2.enteryear(Utility.readFromExcel(driver, 0, 6));
		login2.selectfemale();
		login2.clickOnButton();
		Thread.sleep(10000);

	}
	
  @Test
  public void f() throws EncryptedDocumentException, IOException, InterruptedException {
	 String num1 = login2.validateNo();
	 String num2 = login2.verifyNo();
	 Thread.sleep(10000);
	 Assert.assertEquals(num1, num2,"TC failed");
  }
}
