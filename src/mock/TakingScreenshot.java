package mock;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakingScreenshot {

	public static void main(String[] args) {

		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		
//
//(TakesScreenshot))driver).getScreenshotAs(OutputType.FILE);
//
//File dest = new File("D:\Apurva");
//
//FileHandler.copy(src,dest);


		
		
		
		
		
		
		
		
		
		
	}

}
