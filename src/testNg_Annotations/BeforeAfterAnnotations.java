package testNg_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterAnnotations {

	@Test
	public void testMethod1()
	{
		Reporter.log("test method 1 is running", true);
	}
	
	@Test
	public void testMethod2()
	{
		Reporter.log("test method 2 is running", true);
	}
	
	@BeforeMethod
	public void launchbrowser()
	{
		Reporter.log("launching the browser" ,true);
	}
	
	@AfterMethod
	public void closebrowser()
	{
		Reporter.log("closing the browser" ,true);
	}
}
