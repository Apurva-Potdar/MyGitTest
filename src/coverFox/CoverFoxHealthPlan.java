package coverFox;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlan {

	
	@FindBy(xpath = "//div[text()='Husband']") private WebElement husband;
	
	@FindBy(xpath = "//div[text()='Daughter']") private WebElement daughter;
	
	@FindBy(xpath = "//div[@class='next-btn']") private WebElement clickButton;

	public CoverFoxHealthPlan(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void selectHusband()
	{
		husband.click();
	}
	public void selectDaughter()
	{
		daughter.click();
	}
	public void clickOnButton()
	{
		clickButton.click();
	}	
	
	
}
