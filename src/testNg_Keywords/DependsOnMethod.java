package testNg_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(priority = 3)
	public void payment()
	{
		Reporter.log("payment is done", true);
	}
	
	@Test(timeOut = 2000)
	public void couponCode()
	{
		Reporter.log("coupon code has applied", true);
	}
	
	@Test(dependsOnMethods = {"couponCode"})
	public void discount()
	{
		Reporter.log("20% discount has applied", true);
	}

}
