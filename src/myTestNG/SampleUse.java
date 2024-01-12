package myTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleUse {
	 @Test(groups = "Sanity")
	  public void e() 
	  {
	  Reporter.log("TC a is running ", true);
	  
	  }
	  @Test(groups = "Regression")
	  public void d() 
	  {
	  Reporter.log("TC d is running ", true);
	  
	  }
	  
	  @Test(groups = "Sanity")
	  public void f() 
	  {
	  Reporter.log("TC c is running ", true);
	  
	  }
	  
	  @Test(groups = "Sanity")
	  public void g() 
	  {
	  Reporter.log("TC d is running ", true);
	  
	  }
}
