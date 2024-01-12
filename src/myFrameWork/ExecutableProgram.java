package myFrameWork;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExecutableProgram {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.saucedemo.com/");
		TC02_Login t2 = new TC02_Login(driver);
		t2.userName();
		t2.password();
		t2.submit();

		
		TC02_Inventory t1 = new TC02_Inventory(driver);
		t1.myBackpack();
		t1.myBikeLight();
		t1.myOnesie();
		
		
	}

}
