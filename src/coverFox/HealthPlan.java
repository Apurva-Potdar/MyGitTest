package coverFox;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthPlan {

	@FindBy(xpath ="//div[contains(text(),'Health Insurance Plans')]") private WebElement ResultInString;
	@FindBy(id = "plans-list") private List<WebElement> planList;
	
	public HealthPlan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ExpectedResult()
	{
	 String expected  = ResultInString.getText();
	 String ar[] = expected.split(" ");
	 String number1 = ar[0];
	int num= Integer.parseInt(number1);
	int expectNum = planList.size();
	if(num ==expectNum)
	{
		System.out.println("TC is passed");
	}
	else
	{
		System.out.println("TC is failed");
	}
	
	
	}
	
}
