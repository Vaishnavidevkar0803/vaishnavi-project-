package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listner.class)//packagename.className.class
public class TestClass
{
	@Test 
	public void TC1()
	{
		Reporter.log("tc1 is running", true);
	}
	@Test
	public void TC2()
	{
		Assert.fail();
		Reporter.log("tc2 is running",true);
	}

	@Test(dependsOnMethods = "TC2")
	public void TC3() 
	{
		Reporter.log("Tc3 is running",true);
		
	}
	@Test
	public void tc4()
	{
		Reporter.log("tc4 is running", true);
	}
	
//	tc execution started
//	TC execution is failed (failed tc will execute 1st)
//	tc execution started
//	tc1 is running
//	tc execution started
//	tc4 is running
//	tc execution started
//	tc execution is skipped (dependes on method tc3 will be skipped)
}

