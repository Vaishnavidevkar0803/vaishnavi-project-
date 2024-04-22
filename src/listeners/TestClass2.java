package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 
{
	@Test(dependsOnMethods = "tc8")
	public void TC5()
	{
		Reporter.log("tc5 is running", true);
	}
	@Test
	public void TC6() 
	{
	Reporter.log("tc6 is running", true);	
	}
	@Test
	public void tc7() 
	{
	Reporter.log("tc7 is running", true);	
	}
	@Test
	public void tc8() 
	{
		Assert.fail();
	Reporter.log("tc8 is running", true);	
	}

}
