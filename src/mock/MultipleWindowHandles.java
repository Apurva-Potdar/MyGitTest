package mock;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindowHandles {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        WebElement NewBrowserWindow = driver.findElement(By.xpath("//button[text()='New Browser Window']"));
        NewBrowserWindow.click();

        WebElement NewMessageWindow = driver.findElement(By.xpath("//button[text()='New Message Window']"));
        NewMessageWindow.click();
        
        WebElement NewBrowserTab = driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
        NewBrowserTab.click();

        Set<String> allWindowId = driver.getWindowHandles();

        ArrayList<String> al = new ArrayList<>(allWindowId);

        for (String windowHandle : al) {
            driver.switchTo().window(windowHandle);

            // Perform actions on the current window, if needed
            System.out.println("Title of Window: " + driver.getTitle());
        }
       
    }
}
