package myTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestEg1 {
  @Test
  
	 
	  public void zerodhaLaunch4() {
		  WebDriver driver= new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://mail.google.com/");
			Reporter.log("TC04 is running", true);
	  }
	  
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("before class is running", true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("after class is running", true);
	}

	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("before method is running", true);
	}
	@AfterClass
	public void afterMethod()
	{
		Reporter.log("after method is running", true);
	}

	@Test
	public void zerodhaLaunch3() {
		  WebDriver driver= new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.youtube.com/");	  
			Reporter.log("TC03 is running", true);  

	
  }
}
