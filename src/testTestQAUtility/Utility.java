package testTestQAUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility {
	public static void implicitWait(WebDriver driver, int x)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	}
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Apurva\\vel\\selenium\\myScreenshot\\form1.png");
		FileHandler.copy(src, dest);
	}
	
	
}
