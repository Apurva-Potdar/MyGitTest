package myTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeyWordsUse {
  @Test(dependsOnMethods = {"d"}, priority = 9)
  public void a() {
	  Reporter.log("TC a is running", true);
	  
  }
  @Test(priority = -1)
  public void b() {
	  Reporter.log("TC b is running", true);
	  
  }
  @Test(enabled = false)
  public void c() {
	  Reporter.log("TC c is running", true);
	  
  }
  @Test
  public void d() {
	  Reporter.log("TC d is running", true);
	  
  }
  
}
