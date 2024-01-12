package myTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExcludeUse {
  @Test(groups = "Regression")
  public void a() 
  {
  Reporter.log("TC a is running ", true);
  
  }
  @Test(groups = "Regression")
  public void b() 
  {
  Reporter.log("TC b is running ", true);
  
  }
  
  @Test(groups = "Regression")
  public void c() 
  {
  Reporter.log("TC c is running ", true);
  
  }
  
  @Test(groups = "Sanity")
  public void d() 
  {
  Reporter.log("TC d is running ", true);
  
  }
  
}
