package webTableStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableEg1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		//read complete row
		for(int i=1;i<=3;i++)
		{
		
		WebElement fourthRow = driver.findElement(By.xpath("//table[@id='table1']//tr[4]/td["+i+"]"));
		
		System.out.print(fourthRow.getText()+"  ");
	}
		System.out.println();

	//read one element 
		
		WebElement oneElement = driver.findElement(By.xpath("//table[@id='table1']//tr[3]/td[3]"));
		
		System.out.println(oneElement.getText());	
		
		
		System.out.println("=============================================================");

		//read one single column
		
		List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@id='table1']//tr/td[2]"));
		
		for(int j=1;j<=3;j++)
		{
			
			WebElement columnElement = secondColumn.get(j);
			System.out.println(columnElement.getText());
		
		}
//		List<WebElement> secondRow = driver.findElements(By.xpath("//table[@id='table1']//tr[2]/td"));
//
//		for(int i=0;i<=2;i++)
//		{
//		
//			WebElement secondRowEle = secondRow.get(i);
//			
//			System.out.println(secondRowEle.getText());
//			}
	}
}