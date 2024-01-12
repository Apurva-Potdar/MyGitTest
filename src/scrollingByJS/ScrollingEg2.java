package scrollingByJS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import commonlyUsedMethOD.CommonlyUsedEg1;

public class ScrollingEg2 {

	public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver = new EdgeDriver();
//
driver.manage().window().maximize();
driver.get("https://www.youtube.com/");
//
//JavascriptExecutor js =(JavascriptExecutor)driver;
//Thread.sleep(1000);
//js.executeScript("window.scrollBy(0,700)");
//Thread.sleep(1000);


//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//File dest= new File("D:\\Apurva\\vel\\selenium\\myScreenshot\\utube.png");
//
//FileHandler.copy(src, dest);


CommonlyUsedEg1.scroll(driver, 0, 2000);

	}

}
