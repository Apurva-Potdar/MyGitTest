package popupStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDivPop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/explore/home");

		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Nashik");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='bwc__sc-1iyhybo-10 cWWamV']/ul/li")).click();
		
		
	}

}
