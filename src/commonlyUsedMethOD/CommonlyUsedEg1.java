package commonlyUsedMethOD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

 
public class CommonlyUsedEg1 {
	//scrolling
	//excel sheet handling
	// takes screenshot
	//waiting
	
	public static void scroll(WebDriver driver,int x, int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	public static void waiting(WebDriver driver, int i)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(i));
		
		
	}
	
	public static String ExcelSheetHandle(String path, String sheet,int i, int j) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile= new FileInputStream(path);
		
		
		String value = WorkbookFactory.create(myfile).getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
		
		System.out.println(value);
		return value;
	}
	
	public static void TakesScreenshot(WebDriver driver, String path) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	File dest = new File(path);
	
	
	FileHandler.copy(src, dest);
	
	}	
	
	
	
}





