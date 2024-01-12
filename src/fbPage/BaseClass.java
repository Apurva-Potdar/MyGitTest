package fbPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

public class BaseClass {
	static protected WebDriver driver;
	
	public void launchingBrowser()
		{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Reporter.log("launching browser with facebook login", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		}
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("closing browser", true);
	}
}
