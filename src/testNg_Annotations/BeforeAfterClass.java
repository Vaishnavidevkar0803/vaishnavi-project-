package testNg_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterClass {

	@Test
	public void Tc1()
	{
		Reporter.log("tc1 is running ", true);
	}

	@Test
	public void Tc2()
	{
		Reporter.log("tc2 is running ", true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("before method is running",true );
	}

	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("after method is running",true );
	}
	@BeforeClass
	public void browserlaunch()
	{
		Reporter.log("browser is launched", true);
	}
	@AfterClass
	public void browserclose()
	{
		Reporter.log("browser is closed", true);
	}

}
