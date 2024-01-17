package testTestQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class POM3{

	
	@FindBy(id = "firstName") private WebElement fname;
	@FindBy(id = "lastName") private WebElement lname;
	@FindBy(id = "userEmail") private WebElement email;
	@FindBy(id = "Mobile Number") private WebElement mobileNo;
	@FindBy(id = "dateOfBirthInput") private WebElement dob;
	@FindBy(id = "gender-radio-2") private WebElement femaleGender;

	
	public POM3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void firstName(String firstname)
	{
		fname.sendKeys(firstname);
		Reporter.log("first name value", true);
	}
	
	public void lastName(String lastname)
	{
		lname.sendKeys(lastname);
		Reporter.log("last name value", true);
	}
	public void email(String mailID)
	{
		email.sendKeys(mailID);
		Reporter.log("last name value", true);
	}
	public void mobile(String mobilenum)
	{
		mobileNo.sendKeys(mobilenum);
		Reporter.log(" mob no value", true);
	}
	public void dateOfBirth(String birthDate)
	{
		dob.sendKeys(birthDate);
		Reporter.log("dob value", true);
	}
	public void genderSelection()
	{
		femaleGender.click();;
		Reporter.log("clicking on female gender", true);
	}
	
}
