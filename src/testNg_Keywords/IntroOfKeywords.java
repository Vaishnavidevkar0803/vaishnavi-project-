package testNg_Keywords;

public class IntroOfKeywords {

	public static void main(String[] args) 
	
	//It is also called as helper annotations
	{
		//1)priority -->when we want to change the order of the test cases then this keyword
		//can be used ...priority can be +ve ,-ve,duplicate but it cannot be variable & decimal
		//priorities can be duplicate
		
		//2)dependsOnMethod-->if one test case execution depends on the other test case 
		//then we need to use "dependsOnMethods" TestNG keyword.

		//3)enabled-->disabling the test case can be acheived with the help of Testng by 
		//setting the enable attribute to the false
		
		//4)InvocationCount-->sometimes some testcases needs to be executed multiple times 
		//at that time invocationCount keyword can be used to excute the testcase as many 
		//times as we want to execute  ...bydefault tc will execute atleast 1 time 
		
		//5)timeOut-->In test class if there are multiple test cases & one of the test case
		//is time consuming then testNG will bydefault fail that test case & excute the
		//next test case

	}

}
