package fbUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	public static void takesScreenShot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest= new File("D:\\Apurva\\vel\\selenium\\myScreenshot\\TestCaseID"+TCID+".png");
		FileHandler.copy(src, dest);
	Reporter.log("taking screenshot of login credential", true);
	}
	public static String readFromExcel(WebDriver driver, int rowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	{
		Reporter.log("fetching data from excel sheet", true);
		FileInputStream myfile=new FileInputStream("D:\\Apurva\\velocity\\Book 4.xlsx");
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(rowIndex).getCell(CellIndex).getStringCellValue();
		
		return value;
		
	}
	
}
