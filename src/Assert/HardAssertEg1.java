package Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertEg1 {
	
  @Test
  public void instaLogin() {
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.instagram.com/?hl=en");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	  driver.findElement(By.xpath("//span[text()='Sign up']")).click();
	  
	 
	  
	  WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
	  
	  Assert.assertFalse(signUpButton.isEnabled(),"button is enabled");
	  System.out.println(signUpButton.isEnabled());
	
	 
	  
	  
  }
}
