package testNg_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeyword {


	@Test(priority = 2)
	public void a()
	{
		Reporter.log("TC a is running", true);
	}
	@Test
	public void b()
	{
		Reporter.log("TC b is running",true);
	}

}
