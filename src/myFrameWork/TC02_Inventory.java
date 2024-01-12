package myFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC02_Inventory {

	//1.
	
	@FindBy(name = "add-to-cart-sauce-labs-backpack") private WebElement Backpack;
	@FindBy(name = "add-to-cart-sauce-labs-bike-light") private WebElement BikeLight;
	@FindBy(name = "add-to-cart-sauce-labs-onesie") private WebElement Onesie;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cart;
	
	//2.
	
	public TC02_Inventory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void myBackpack()
	{
		Backpack.click();
	}
	public void myBikeLight()
	{
		BikeLight.click();
	}
	public void myOnesie()
	{
		Onesie.click();
		
	}
	public void myCart()
	{
		cart.click();
		
	}
}
