package webTableStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Eg2 {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> firstRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td"));
		
		for(WebElement fr:firstRow)
		{
			
			System.out.println(fr.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
