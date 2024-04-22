package testNg_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeOfAnnotations {

	@Test
	public void TC()
	{
		Reporter.log("validate the userId-->@test1", true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("validate the userId2-->@test2", true);
	}
	
	@BeforeMethod
	public void enterPassword()
	{
		Reporter.log("enter the password-->@beforeMethod", true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout is done-->@afterMethod", true);
	}
	
	@BeforeClass
	public void launchUrl()
	{
		Reporter.log("launch the url-->@beforeClass", true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close the browser-->@afterClass",true);
	}

}
