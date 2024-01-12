package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
	
	 WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();
		 Thread.sleep(500);
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(500);
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(500);
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(500);
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(500);
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 act.sendKeys(Keys.ENTER).perform();		
		
	}

}
