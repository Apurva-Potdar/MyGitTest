package myFrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC01 {
	
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://in.bookmyshow.com/");
		
		driver.findElement(By.xpath("//span[text()='Pune']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("pune");
//		
//		driver.findElement(By.xpath("//div[@class='bwc__sc-1iyhybo-10 cWWamV']//ul/li")).click();
		
//		driver.findElement(By.xpath("//div[text()='Sam Bahadur']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Sam Bahadur']")).click();
		driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
		
		driver.findElement(By.id("wzrk-cancel")).click();
		
		
		
	}

}
