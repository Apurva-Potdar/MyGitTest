package myFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC02_Login {

	//1. variable
	//2. constructor
	//3. method
	
	//1. variable
	
	@FindBy(id = "user-name") private WebElement userName;
	@FindBy(id = "password") private WebElement password;
	@FindBy(id = "login-button")private WebElement loginButton;
	
	//2.Constructor
	
	public TC02_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userName()
	{
		userName.sendKeys("standard_user");
	}
	public void password()
	{
		password.sendKeys("secret_sauce");
	}
	public void submit()
	{
		loginButton.click();
	}
}
