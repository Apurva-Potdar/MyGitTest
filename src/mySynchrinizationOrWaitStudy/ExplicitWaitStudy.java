package mySynchrinizationOrWaitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/contact-us");//51 sec
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		driver.findElement(By.xpath("//button[@data-testid='close-button']")).click();
		
//		Thread.sleep(1000);

//   	driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("8421526902");
	
//	Thread.sleep(1000);
	
//	driver.findElement(By.xpath("//button[text()='Request OTP']")).click();

		WebElement submitButton = driver.findElement(By.xpath("//span[text()='Submit']"));
		
		WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(10000));

		w.until(ExpectedConditions.elementToBeClickable(submitButton));
		
		submitButton.click();
	}

}
