package coverFoxUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetail {
	@FindBy(id = "Age-You") private WebElement myAge;
	
	@FindBy(id = "Age-Spouse") private WebElement spouseAge;
	
	@FindBy(id = "Age-Daughter-0") private WebElement daughterAge;
	
	@FindBy(xpath = "//div[text()='Next']") private WebElement clickButton;
	public CoverFoxMemberDetail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void myAgeSelect(String age)
	{
		Select s1= new Select(myAge);
		s1.selectByValue(age+"y");
		
	}
	public void spouseAgeSelect(String age1)
	{
		
		Select s2 = new Select(spouseAge);
		s2.selectByValue(age1+"y");
	}
	public void daughterAgeSelect(String age2)
	{
		
		Select s2 = new Select(daughterAge);
		s2.selectByValue(age2+"y");
	}
	public void clickOnButton()
	{
		clickButton.click();
	}
}
