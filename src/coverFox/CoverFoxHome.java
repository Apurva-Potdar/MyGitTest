package coverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHome {

	//1.
	//2.
	//3.
	@FindBy(xpath = "//div[text()='Female']") private WebElement femaleRadioButton;
	
	public CoverFoxHome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnFemaleRadioButton()
	{
		femaleRadioButton.click();
	}
}
