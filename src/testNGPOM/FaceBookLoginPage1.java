package testNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fbPage.BaseClass;

public class FaceBookLoginPage1 extends BaseClass {

	@FindBy(linkText ="Create new account")private WebElement Create_new_accountButton;
	
	
	public FaceBookLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnButton()
	{
		Create_new_accountButton.click();
	}
	
	
	
}