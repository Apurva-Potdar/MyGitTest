package scrollingByJS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenMultipleWindow {

	public static void main(String[] args) {

		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.navigate().to("https://www.youtube.com/");
		
		
		
	}

}
