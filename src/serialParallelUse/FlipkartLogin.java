package serialParallelUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FlipkartLogin {
	
	@Test
	public void amazonTest()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
	}

}
