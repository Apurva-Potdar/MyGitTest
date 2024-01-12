package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FailedXMLUse {
  @Test
  public void facebookLogin() {
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
  }
  @Test
  public void instaLogin() {
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.instagram.com/?hl=en");
//	  Assert.fail();
  }
  @Test
  public void twitterLogin() {
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://twitter.com/");
//      Assert.fail();
  }
}
