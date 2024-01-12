package myLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_Study {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://automationtesting.co.uk/buttons.html");
		
//		driver.findElement(By.cssSelector("button[onclick=\"myFunctionTwo()\"]")).click();
//		
//		Thread.sleep(1000);
//		
		driver.findElement(By.cssSelector("a.toggle")).click();
	}

}
