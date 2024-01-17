package testTestQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class POM2 {

	@FindBy(xpath = "//span[text()='Practice Form']") private WebElement PracticeForm;
	
	public POM2(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	public void clickOnRegistrastion()
	{
	
		PracticeForm.click();
		
		
	}
	
}
