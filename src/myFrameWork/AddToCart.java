package myFrameWork;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddToCart {

	public static void main(String[] args) {

	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
driver.get("https://www.saucedemo.com/v1/");

driver.findElement(By.id("user-name")).sendKeys("standard_user");

driver.findElement(By.id("password")).sendKeys("secret_sauce");

driver.findElement(By.xpath("//input[contains(@title,'Search for products')]")).sendKeys("Redmi Note 12");
	
List<WebElement> RedmiSearches = driver.findElements(By.xpath("//div[@class='_1cmsER']//ul//li"));
	
	ArrayList<WebElement> al = new ArrayList<>(RedmiSearches);
	
	String Expected= "redmi note 12 pro plus";
	for(WebElement RS:al)
	{
		if(RS.getText().equals(Expected))
		{
			System.out.println("Selected item is correct");
			RS.click();
		}
	}
	
	}

}
