package scrollingByJS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Eg1 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
driver.get("https://omayo.blogspot.com/");

WebElement text1 = driver.findElement(By.xpath("//h2[text()='Text Area Field']"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView();",text1 );
		
js.executeScript("window.scrollBy(100,200)");
		
		
		
		
	}

}
