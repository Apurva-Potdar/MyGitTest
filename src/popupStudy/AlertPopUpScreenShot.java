package popupStudy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class AlertPopUpScreenShot {

	public static void main(String[] args) {
		
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new EdgeDriver();

		        // Navigate to a webpage that triggers an alert
		        driver.get("https://demoqa.com/alerts");

		        driver.findElement(By.id("alertButton")).click();
		        // Trigger an alert (replace this with your own alert-triggering code)
		        // For example, you might need to click a button that triggers an alert
		        // You can handle alerts using Alert interface
		        Alert alert = driver.switchTo().alert();
//		        alert.accept(); // Accept the alert

		        // Take a screenshot of the entire browser window
		        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		        // Specify the location where you want to save the screenshot
		        String screenshotPath = "D:\\Apurva\\vel\\selenium\\myScreenshot\\alert.png";

		        try {
		            // Copy the screenshot to the specified location
		            FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		            System.out.println("Screenshot saved at: " + screenshotPath);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        // Close the browser
		        driver.quit();
		    }
		}

		
		
		
		
		
	
