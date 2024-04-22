package testng_Assert;

public class Assertions_Intro 
{
	//Assertions in TestNG are a way to verify that the expected result and the 
	//actual result matched or not.
	//it contains static methods
	
	//In Selenium, Asserts are validations or checkpoints for an application. 
	//Assertions state confidently that application behavior is working as
	//expected. Asserts in Selenium validate the automated test cases that help 
	//testers understand if tests have passed or failed.
	
	//HardAssert-->
	//Hard Assert is a technique used in software testing to check whether a 
	//certain condition is true or not. In other words, it is a way of verifying 
	//that a certain piece of code is working as expected. When an assert 
	//statement is executed, it compares the actual outcome of a test with the 
	//expected outcome. If the two outcomes match, the assert statement passes 
	//and the test continues. If the actual outcome does not match the expected
	//outcome, the assert statement fails and the test is halted (to stop moving,
	//doing something, or happening). The remaining tests are skipped and the 
	//test is marked as failed.
	
	//SoftAssert-->
	//To overcome assert class drawback we need to use soft assert.
	//It is a class which contains non-static methods use to do verification.
	//Soft assert will do verification if any verification point fails, it will 
	//execute the rest of verification in a test method

	
	//differnce between soft & hard assert
	//if you need your @Test Method to fail straight away after one of its
	//Asserts fails, use Hard Asserts. If you want the execution to proceed even
	//if an assert fails, if you want to see how the following asserts behave,
	//and if you want to see the full result at the end of the test, you need to
	//use Soft Asserts.

}
