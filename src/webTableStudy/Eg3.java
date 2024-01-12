package webTableStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Eg3 {

//	public static void main(String[] args) {
//WebDriver driver = new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://omayo.blogspot.com/");
//		
//		int numOfRows = driver.findElements(By.xpath("//table[@id='table1']//tr")).size();
//		System.out.println(numOfRows);
//	
//		int numOfColumn = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();
//		
//		System.out.println(numOfColumn);
//		
//		// only for header
//		
//		for(int i=1;i<=numOfColumn;i++)
//		{
//			String data1 = driver.findElement(By.xpath("//table[@id='table1']/thead/tr[1]/th["+i+"]")).getText();
//			
//			System.out.print(data1+ "  ");
//			}
//		System.out.println();
//		System.out.println("+++++++++++++++++++++++++++");
//		//only for table body
//
//		for(int i=1;i<numOfRows;i++)
//		{
//			for(int j=1;j<=numOfColumn;j++)
//			{
//					
//					String data1 = driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]/td["+j+"]")).getText();
//					
//					System.out.print(data1+"  ");
//				}
//				System.out.println();
//				System.out.println("===========================");
//			}
//		
//	System.out.println("+++++++++++++++++++++++++++");
//	
//	System.out.println("//for whole web table");
	//for whole web table	
//	for(int i=1;i<numOfRows;i++) {
//		
//		for(int j=1;j<=numOfColumn;j++)
//		{
//			if(i==1)
//			{
//				String data2=driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]/th["+j+"]")).getText();
//				
//				System.out.print(data2+"  ");
//			}
//			else if(i!=1) {
//				String data2=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
//				
//				System.out.print(data2+"  ");
//
//				
//			}
//			else {
//				String data2=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td["+j+"]")).getText();
//				
//				System.out.print(data2+"  ");
//
//			}
//		}
//		System.out.println();
//		System.out.println("================================================");
//	}
//	}
//}
//		
//
	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		int numOfRows =	driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

		int numberOfColumns =driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();

		System.out.println("============================================");

		for(int i=1;i<=numOfRows;i++)//outer-->row-->1-->7
		{
		for(int j=1;j<=numberOfColumns;j++)//inner for loop-->for columns-->1-->4
		{
		if(i==1)
		{
		WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
		System.out.print(data.getText()+" ");
		}
		
		
		
		else {
		WebElement data =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
		System.out.print(data.getText()+" ");
		}
		}
		System.out.println();

		System.out.println("============================================");

		}
		}
	}