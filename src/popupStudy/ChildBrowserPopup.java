package popupStudy;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.io.FileHandler;

public class ChildBrowserPopup {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();

//driver.get("https://demoqa.com/");
//
//Thread.sleep(2000);
//
//driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
//
//Thread.sleep(2000);
//
//
//driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
driver.get("https://demoqa.com/browser-windows");
	
Thread.sleep(2000);

	driver.findElement(By.xpath("//button[text()='New Window']")).click();
	Thread.sleep(1000);
	
	Set<String> allWindows = driver.getWindowHandles();
	
	Iterator<String> it = allWindows.iterator();
	
	String mainPageId = it.next();
	
	String childID = it.next();
	
	driver.switchTo().window(childID);
	
	driver.manage().window().maximize();
	
	String childPageContent=driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
	
	System.out.println(childPageContent);
	
	driver.switchTo().window(mainPageId);
	Thread.sleep(1000);

	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest= new File("D:\\Apurva\\velocity\\selenium\\myScreenshot\\demoqa.png");
	
	FileHandler.copy(source, dest);

	

	
	}

}
