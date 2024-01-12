package excelSheetHandle;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commonlyUsedMethOD.CommonlyUsedEg1;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		CommonlyUsedEg1.waiting(driver, 1000);
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

		WebElement telphone = driver.findElement(By.xpath("//input[@type='tel']"));

		WebElement female = driver.findElement(By.xpath("//input[@value='FeMale']"));

		WebElement DropdownYear = driver.findElement(By.xpath("//select[@placeholder='Year']"));

		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));

		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));

		
		firstname.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 0));
		lastname.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 1));
		telphone.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 3));
		email.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 10));
//		firstname.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 0));
		
		 Actions act = new Actions(driver);
		
		act.click(female).perform();
		
		Select s = new Select(DropdownYear);
		
		s.selectByValue("1995");
Select s1 = new Select(month);
		
		s1.selectByValue("January");
		
Select s2 = new Select(day);
		
		s2.selectByValue("21");
		
		
		
		
		
		
		
		
	}

}
