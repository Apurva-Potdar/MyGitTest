package serialParallelUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AjioLogin {
	
	@Test
	public void ajioTest()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ajio.com/");
		
	}

}
