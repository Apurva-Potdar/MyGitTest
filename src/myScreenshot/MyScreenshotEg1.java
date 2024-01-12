package myScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class MyScreenshotEg1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		Thread.sleep(500);

		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement webSubmit = driver.findElement(By.name("websubmit"));
		
js.executeScript("arguments[0].scrollIntoView()", webSubmit);

		Thread.sleep(10000);
		
	 File src = webSubmit.getScreenshotAs(OutputType.FILE);
		
	 String rndm = RandomString.make(4);
		 	 
		 File dest= new File("D:\\Apurva\\vel\\selenium\\myScreenshot\\insta"+rndm+".png");
		 
		 FileHandler.copy(src, dest);
		
		
	}

}
