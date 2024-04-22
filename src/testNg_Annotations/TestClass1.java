package testNg_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass1
{
  @Test
  public void TC1()
  {
	  Reporter.log("TC1 IS running", true);
	  //if we make it as a false it will not seen on console but can be seen on 
	  //emailable report
  }
  
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running", true);
  }
  
  @BeforeMethod 
  public void beforeMethod()
  {
	  Reporter.log("before method is running", true);
  }

  @AfterMethod 
  public void afterMethod()
  {
	  Reporter.log("after method is running", true);
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("before class is running", true);
  }
  
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("after class is running", true);
  }
  
  @BeforeSuite
  public void beforesuite()
  {
	  Reporter.log("before suite is running", true);
  }
  
  @AfterSuite
  public void aftersuite()
  {
	  Reporter.log("after suite is running", true);
  }
}
