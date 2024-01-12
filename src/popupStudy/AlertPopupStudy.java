package popupStudy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopupStudy {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts ");
		Thread.sleep(10000);
		driver.findElement(By.id("confirmButton")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());

//		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D:\\Apurva\\vel\\selenium\\myScreenshot\\sc1.jpg"));

		
		System.out.println(alt.getText());
			
		
		alt.accept();
		
		
		
	}

}
