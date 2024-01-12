package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class ScrollStudy {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions act = new Actions(driver);
		WebElement slider = driver.findElement(By.id("slider"));
		
		act.scrollToElement(slider).perform();

		act.dragAndDropBy(slider, 30, 0).perform();
	
		
		
	}

}
