package testNg_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 3)
	public void a()
	{
		Reporter.log("tc a is running", true);
	}
	@Test(invocationCount = 2)
	public void b()
	{
		Reporter.log("tc b is running", true);
	}
	@Test(invocationCount = 2)
	public void c()
	{
		Reporter.log("tc c is running", true);
	}
	@Test(invocationCount = 4)
	public void d()
	{
		Reporter.log("tc d is running", true);
	}

}
