package myTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleReport {
  @Test
  public void zerodhaLaunch() {
	  WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Reporter.log("TC is running", true);
  }
  
@Test
public void zerodhaLaunch1() {
	  WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");	
		Reporter.log("TC01 is running", true);
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
@AfterMethod
public void afterMethod()
{
	Reporter.log("after method is running", true);
}

@Test
public void zerodhaLaunch2() {
	  WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/?lang=en-in");	  
		Reporter.log("TC02 is running", true);  

}
}
