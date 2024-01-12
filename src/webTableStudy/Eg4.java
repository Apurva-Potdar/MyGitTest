package webTableStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Eg4 {

	public static void main(String[] args) {
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/gujarat-titans-vs-chennai-super-kings-final-1370353/full-scorecard");

String data1 = driver.findElement(By.xpath("(//table[@class='ds-w-full ds-table ds-table-md ds-table-auto  ci-scorecard-table'])[2]//tr[1]/td[1]")).getText();
	
	System.out.println(data1+" ");
	
int numOfRows = driver.findElements(By.xpath("(//table[@class='ds-w-full ds-table ds-table-md ds-table-auto  ci-scorecard-table'])[2]//tr")).size();

int numOfColumns = driver.findElements(By.xpath("(//table[@class='ds-w-full ds-table ds-table-md ds-table-auto  ci-scorecard-table'])[2]//tr[1]/th")).size();

for(int i=1;i<=numOfRows;i++)
{
for(int j=1;j<=numOfColumns;j++)
{
	if(i==1)
	{
WebElement data2 = driver.findElement(By.xpath("(//table[@class='ds-w-full ds-table ds-table-md ds-table-auto  ci-scorecard-table'])[2]//tr["+i+"]/th["+j+"]"));
	System.out.print(data2.getText()+"  ");
	}

	else {
		
		WebElement data2 = driver.findElement(By.xpath("(//table[@class='ds-w-full ds-table ds-table-md ds-table-auto  ci-scorecard-table'])[2]//tr["+i+"]/td["+j+"]"));
		System.out.print(data2.getText()+"  ");
	
	
	}
}
System.out.println();
System.out.println("================================================");
}
}
}
