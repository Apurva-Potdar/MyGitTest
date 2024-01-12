package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleClickStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
//		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt']"));
//		Thread.sleep(1000);
//
		Actions act=new Actions(driver);
//		act.click(prompt).perform();
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Thread.sleep(1000);
		act.doubleClick(doubleClick).perform();
	
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(rightClick).perform();
	}

}
