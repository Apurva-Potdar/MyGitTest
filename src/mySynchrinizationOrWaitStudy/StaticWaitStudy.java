package mySynchrinizationOrWaitStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticWaitStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");//51 sec

		Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("8421526902");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	}

}
