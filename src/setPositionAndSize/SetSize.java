package setPositionAndSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new EdgeDriver();
		driver.get("https://www.javatpoint.com/");
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		Thread.sleep(1000);
		Point p =new Point(0,0);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);

		Dimension dimen = driver.manage().window().getSize();
		System.out.println(dimen);
		
		Dimension d = new Dimension(100,500);
		Thread.sleep(1000);

		driver.manage().window().setSize(d);
	}

}
