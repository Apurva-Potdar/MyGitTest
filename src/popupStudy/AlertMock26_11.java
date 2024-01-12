package popupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertMock26_11 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Alert alt = driver.switchTo().alert();
	
	alt.accept();
	}

}
