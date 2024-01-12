package coverFoxUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails {

	@FindBy(xpath = "//input[@placeholder='6 Digit Pincode']") private WebElement pinCode;
	@FindBy(xpath = "//input[@placeholder='Your mobile number']") private WebElement phoneNo;
	
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continueButton;
	
	public CoverFoxAddressDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendPinCodeNo(String pincode)
	{
		pinCode.sendKeys(pincode);
		
	}
	public void sendMobileNo(String mobNo)
	{
		phoneNo.sendKeys(mobNo);
		
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
		
	}
	
	
	
}
