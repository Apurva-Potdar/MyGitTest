package testTestQA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class POM1{
	@FindBy(xpath = "(//*[@class=\"card-body\"])[2]") private WebElement forms;
	//@FindBy(xpath = "//h5[text()='Forms']") private WebElement forms;
	
	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//	public void scolling(WebDriver driver)
//	{
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].scrollIntoView();",forms);
//
//		//js.executeScript("Arguments[0].scrollIntoView();", forms);
//	}
	public void clickOnForm()
	{
		
		forms.click();
				
	}
	
}
