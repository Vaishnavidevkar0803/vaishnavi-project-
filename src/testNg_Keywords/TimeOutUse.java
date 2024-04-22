package testNg_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {

	@Test(timeOut = 2000)
	public void a() throws InterruptedException
	{
		Thread.sleep(3000);
		Reporter.log("Tc a is running", true);
	}
	
	@Test(timeOut = 2000)
	public void b() 
	{
		Reporter.log("Tc b is running", true);
	}
}
