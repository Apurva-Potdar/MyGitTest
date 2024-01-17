package testTestQABase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import testTestQA.POM1;
import testTestQA.POM2;
import testTestQA.POM3;
import testTestQAUtility.Utility;

public class testNG_testQA extends Base {
	

	WebDriver driver;
	Base b1;
	POM1 p1;
	POM2 p2;
	POM3 p3;
	Utility ut;
	
	
	@BeforeClass
	
	public void launchBrowser() throws InterruptedException
	{
		b1= new Base();
		p1 = new POM1(driver);
		p2=new POM2(driver);
		p3 = new POM3(driver);
		ut = new Utility();
		b1.launching();
		Thread.sleep(3000);
		//Utility.implicitWait(driver, 3000);
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		//Utility.implicitWait(driver, 3000);
		b1.closing();
	}
	@BeforeMethod
	public void clickingForm()
	{
		p1.clickOnForm();
	}
	public void openForm()
	{
		p2.clickOnRegistrastion();
	}
	
  @Test
  public void f() {
	  p3.firstName("Apurva");
	  p3.lastName("Potdar");
	  p3.email("potdaras29@gmail.com");
	  p3.genderSelection();
	  p3.mobile("8765432190");
	  p3.dateOfBirth("21 Jan 1995");
  }
  
}
