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

public class RegistrationForm {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/demo-site/");
		
		CommonlyUsedEg1.waiting(driver, 1000);
		
	WebElement firstname = driver.findElement(By.xpath("//input[@name='vfb-5']"));
		
		 WebElement lastname = driver.findElement(By.xpath("//input[@name='vfb-7']"));
		
		WebElement female = driver.findElement(By.xpath("//input[@value='Female']"));
		
		WebElement maleGender = driver.findElement(By.xpath("//input[@value='Male']"));
		
		WebElement address = driver.findElement(By.xpath("//input[@name='vfb-13[address]']"));

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		
		WebElement zipcode = driver.findElement(By.xpath("//input[@name='vfb-13[zip]']"));
		
		WebElement country = driver.findElement(By.xpath("//span[@aria-controls='select2-vfb-13-country-container']"));
		
		WebElement state = driver.findElement(By.xpath("//input[@name='vfb-13[state]']"));
		WebElement city = driver.findElement(By.xpath("//input[@name='vfb-13[city]']"));
		
		firstname.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 0));
		lastname.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 1));
		
		address.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 3));
		email.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 10));
		zipcode.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 8));
		country.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 9));
		state.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 7));
	    
		city.sendKeys(CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 6));

		Actions act = new Actions(driver);
		act.click(female);
		
		Select s= new Select(country);
		s.selectByVisibleText("India");
	}
	
	
	
	
}
