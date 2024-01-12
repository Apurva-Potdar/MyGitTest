package coverFox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExecutableClass {

	public static void main(String[] args) {
WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
driver.manage().window().maximize();

driver.get("https://www.coverfox.com/");
CoverFoxHome home = new CoverFoxHome(driver);
home.clickOnFemaleRadioButton();
CoverFoxHealthPlan plan1 = new CoverFoxHealthPlan(driver);
plan1.selectHusband();
plan1.selectDaughter();
plan1.clickOnButton();

CoverFoxMemberDetail member = new CoverFoxMemberDetail(driver);
member.myAgeSelect();
member.spouseAgeSelect();
member.daughterAgeSelect();
member.clickOnButton();

CoverFoxAddressDetails address = new CoverFoxAddressDetails(driver);
address.sendPinCodeNo();
address.sendMobileNo();
address.clickOnContinueButton();

HealthPlan plan = new HealthPlan(driver);
plan.ExpectedResult();
	
	
	
	
	
	}

}
