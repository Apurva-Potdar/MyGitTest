package scrollingByJS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {

WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();

driver.get("https://www.naukri.com/");

WebElement featuredCompanies = driver.findElement(By.xpath("//h2[contains(text(),'Featured companies')]"));
	
Thread.sleep(1000);

JavascriptExecutor js = (JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView()", featuredCompanies);
	
	Thread.sleep(2000);
	
	WebElement sponsoredCompanies = driver.findElement(By.xpath("//h2[contains(text(),'Sponsored companies')]"));
	
	js.executeScript("arguments[0].scrollIntoView()", sponsoredCompanies);
	Thread.sleep(10000);
	
	File src = sponsoredCompanies.getScreenshotAs(OutputType.FILE);

	File dest=new File("D:\\Apurva\\vel\\selenium\\myScreenshot\\naukri.png");
	FileHandler.copy(src, dest);
	
	
	}

}
