package testng_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAsser
{
  @Test
  public void hardAssert()
  {
	  String a="java";
	  String b="selenium";
	  String c=null;
	  
	  //assertEquals-->Used to verify expected and actual results. If both results are 
	 // same then output is pass otherwise fail.

	 // Assert.assertEquals(a, b,"a and b is not matching ,TC is failed");
	  
	  //assertNotEquals-->used to verify expected ans actual results .if both results are
	  //not matching then only tc pass or failed
	  
	  Assert.assertNotEquals(a,b,"a and b are matching ,TC is failed");
	  
	  //asserNotNull-->Use to verify components or text fields empty or not, if it 
	 // is not empty output is pass otherwise fail.
	  
	  Assert.assertNotNull(b, "b is null ,TC is failed");
	  
	  //assertNull-->use to verify component or the text feild is empty or not ,if it's 
	  //empty then only tc is passed or failed
	  
	  Assert.assertNull(c, "c is not null,TC is failed");  
  }
  @Test
  public void asserts()
  {
	  //assertTrue-->This method is use to verify conditions are true or false. 
	  //If condition is true output is pass otherwise fail.
	  
	  boolean a=true;
	  boolean b=false;
	  
	  Assert.assertTrue(a, "a is not true ,TC is failed");
	  
	  //assertFalse-->Use to verify conditions are true or false, if condition is true
	 // output is fail and if condition is false then output is pass.
	  
	  Assert.assertFalse(b, "b is true ,TC is failed");
	  
  }

//  fail()
//  This method is used to intentionally failed test method.

      @Test
      public void asserFail()
      {
    	 Reporter.log("check assert.fail asseration", true); 
    	  Assert.fail();
    	  Reporter.log("TC is running", true);
      }
}       
	  
	  

	  

  

