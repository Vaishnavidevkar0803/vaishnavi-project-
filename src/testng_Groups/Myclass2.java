package testng_Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass2 
{
	@Test(groups = "sanity")
	public void TC5()
	{
		Reporter.log("TC5 is running", true);
	}
	@Test(groups = "smoke")
	public void TC6()
	{
		Reporter.log("TC6 is running", true);
	}
	@Test(groups = "sanity")
	public void TC7()
	{
		Reporter.log("TC7 is running", true);
	}
	@Test(groups = "smoke")
	public void TC8()
	{
		Reporter.log("TC8 is running", true);
	}


}
