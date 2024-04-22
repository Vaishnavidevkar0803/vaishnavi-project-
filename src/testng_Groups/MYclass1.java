package testng_Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MYclass1 
{
	@Test(groups = "sanity")
	public void TC1()
	{
		Reporter.log("TC1 is running", true);
	}
	@Test(groups = "smoke")
	public void TC2()
	{
		Reporter.log("TC2 is running", true);
	}
	@Test(groups = "sanity")
	public void TC3()
	{
		Reporter.log("TC3 is running", true);
	}
	@Test(groups = "somke")
	public void TC4()
	{
		Reporter.log("TC4 is running", true);
	}

}
