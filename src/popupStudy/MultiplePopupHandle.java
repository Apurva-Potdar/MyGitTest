package popupStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MultiplePopupHandle {

	public static void main(String[] args) throws InterruptedException {
EdgeOptions dopt= new EdgeOptions();

dopt.addArguments("--version");		
WebDriver driver = new EdgeDriver(dopt);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(10000);
//		driver.findElement(By.id("bottom-left-section.inventory-1")).click();
	driver.findElement(By.xpath("//span[text()='HR']")).click();
		
	Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		
		Thread.sleep(1000);
		Set<String> windowId = driver.getWindowHandles();
		
		Iterator<String> itr = windowId.iterator();
		
		while(itr.hasNext())
		{
	driver.switchTo().window(itr.next());
	
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	
	
		}
		
		
		
//		ArrayList<String> al= new ArrayList<>(windowId);
//		String mainpageId = (al.get(0));
//		String firstPage=al.get(1);
//		String secondPage =al.get(2);
//		
//		System.out.println(mainpageId);
//		driver.switchTo().window(mainpageId);
//		
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(firstPage);
//		System.out.println(firstPage);
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(secondPage);
//		System.out.println(secondPage);
//		System.out.println(driver.getTitle());
//		
		//		for(int i=0;i<al.size();i++)
//		{
//			Thread.sleep(1000);
//			driver.switchTo().window(al.get(i));
//			Thread.sleep(1000);
//			System.out.println(driver.getTitle());
//		}
		
		
		
		
	}

}
