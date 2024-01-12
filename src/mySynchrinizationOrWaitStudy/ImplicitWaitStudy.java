package mySynchrinizationOrWaitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args) throws InterruptedException {
				WebDriver driver= new EdgeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.flipkart.com/");//29 sec

				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

			driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("8421526902");
			
		//	Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
			}

		

		
		
		
		
		
		
	}

