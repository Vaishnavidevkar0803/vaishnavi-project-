package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("tc execution started",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
		Reporter.log("TC execution is failed",true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
	Reporter.log("tc execution is skipped", true);	
	}

}
