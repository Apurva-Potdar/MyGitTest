package testTestQABase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

import testTestQAUtility.Utility;

public class Base {
	static protected WebDriver driver;

	public void launching() throws InterruptedException
	{
		driver = new EdgeDriver();
		Reporter.log("window get maximized", true);
		
		Reporter.log("open testQA url", true);
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Utility.implicitWait(driver, 500);
	}
	public void closing()
	{
		Reporter.log("closing testQA tab", true);
		driver.close();
		
	}
	
	
	
}
