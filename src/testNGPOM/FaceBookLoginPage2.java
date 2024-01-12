package testNGPOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import fbPage.BaseClass;
import fbUtility.Utility;

import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage2 extends BaseClass {

	@FindBy(name = "firstname") private WebElement fName;
	@FindBy(name = "lastname") private WebElement lName;
	@FindBy(name = "reg_email__") private WebElement mobNo;
	@FindBy(id = "password_step_input") private WebElement password;
	@FindBy(id = "day") private WebElement daySelector;
	@FindBy(id = "month") private WebElement monthSelector;
	@FindBy(id = "year") private WebElement yearSelector;
	@FindBy(xpath = "//input[@value='1']") private WebElement femaleSelect;
	@FindBy(xpath = "(//button[text()='Sign Up'])[1]") private WebElement signUpButton;

	@FindBy(xpath = "//span[text()='084215 26909']") private WebElement verifyNo;
	public FaceBookLoginPage2(WebDriver driver)
	
	{
	PageFactory.initElements(driver, this);
	}
	
	public void enterFirstName(String firstName)
	{
		fName.sendKeys(firstName);
		
	}
	
	public void enterLastName(String lastName)
	{
	lName.sendKeys(lastName);
	
	}
	
	public void enterMobileNo(String mobileNo)
	{
	mobNo.sendKeys(mobileNo);
	}
	
	public void enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void enterday(String day)
	{
		
		 Select s= new Select(daySelector);
		s.selectByValue(day);
	}
	public void entermonth(String month)
	{
		
		 Select s1= new Select(monthSelector);
		s1.selectByValue(month);
	}
	
	
	public void enteryear(String year)
	{
		
		 Select s2= new Select(yearSelector);
		s2.selectByValue(year);
	}
	
	public void selectfemale()
	{
		
		femaleSelect.click();
	}
	public void clickOnButton()
	{
		signUpButton.click();
	}
	
	public String validateNo() 
	{
		String actual = verifyNo.getText();
		return actual;
		
	}
	public String verifyNo() throws EncryptedDocumentException, IOException
	{
		String fetchNo = Utility.readFromExcel(driver, 0, 2);
		return fetchNo;
	}
	
}
