package coverFox;

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
	public void myAgeSelect()
	{
		Select s1= new Select(myAge);
		s1.selectByValue("27y");
		
	}
	public void spouseAgeSelect()
	{
		
		Select s2 = new Select(spouseAge);
		s2.selectByValue("29y");
	}
	public void daughterAgeSelect()
	{
		
		Select s2 = new Select(daughterAge);
		s2.selectByValue("1y");
	}
	public void clickOnButton()
	{
		clickButton.click();
	}
}
