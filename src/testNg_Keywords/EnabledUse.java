package testNg_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse 
{
@Test
public void a() 
{
Reporter.log("tc a is running", true);	
}

@Test
public void b() 
{
Reporter.log("tc b is running", true);	
}
@Test(enabled = false)//it will not get failed nor skipped ,test case will disable only
public void c() 
{
Reporter.log("tc c is running", true);	
}
}
