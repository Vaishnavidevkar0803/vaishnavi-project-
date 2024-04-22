package testng_Assert;

import org.testng.annotations.Test;

public class SoftAssert 
{
   
	@Test
	public void TC1()
	{
		String a="hi";
		String b="hello";
		
		org.testng.asserts.SoftAssert s1=new org.testng.asserts.SoftAssert();
		s1.assertEquals(a, b,"a and b values are not matching ,TC1 failed");
		
		s1.assertNotEquals(a, b,"a and b values are matching ,TC failed");
		
		s1.assertNotNull(b, "a is null ,TC1 is failed");
		
		s1.assertAll();
		//assertAll() method is used to verify that all assertions within a test method
		//have passed. It is used to ensure that all expected results are being verified.
		
	}
	
	@Test
	public void Tc2() 
	{
		String a =null;
		
		org.testng.asserts.SoftAssert s2=new org.testng.asserts.SoftAssert();
		s2.assertNull(a, "a is not null,TC is failed");
		
	}
}
