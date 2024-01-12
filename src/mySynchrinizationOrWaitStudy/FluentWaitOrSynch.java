package mySynchrinizationOrWaitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitOrSynch {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
		WebElement getOTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		Wait<WebDriver> w= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		
				w.until(ExpectedConditions.elementToBeClickable(getOTPbutton));

		
		
		
		
		
	}

}
