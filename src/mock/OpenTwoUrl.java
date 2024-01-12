package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import commonlyUsedMethOD.CommonlyUsedEg1;

public class OpenTwoUrl {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		CommonlyUsedEg1.waiting(driver, 1000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Actions act = new Actions(driver);
		act.keyDown(Keys.F5).keyUp(Keys.F5).perform();
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	WebDriver driver1 = new EdgeDriver();
	driver1.get("https://www.instagram.com/?hl=en");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.open('', '_blank');");

		
		
		
	}

}
