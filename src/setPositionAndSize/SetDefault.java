package setPositionAndSize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetDefault {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
	
		Point defaultPosition = driver.manage().window().getPosition();
		
		System.out.println(defaultPosition);
	
		Point p=new Point(-10, -10);
		
		driver.manage().window().setPosition(p);
		
	}

}
