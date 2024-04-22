package selenium_use_synchronization_waits;

public class Synchronization_Intro {

	public static void main(String[] args) 
	{
	//intro
	//synochronization-->matching selenium test script speed with the browser/application
	//2 types of wait -->1)Static wait  2)Dynamic wait 
		
	//Static wait = wait time is fixed 
	//If in a test script there are 4 to 5 pages needs to upload one after another 
	//so before each page uploads we have to mention static wait-->Thread.sleep(500)
	//which will increases the steps in test script 
		
	//Sleep is a static method that belongs to the thread class and it is not one of 
	//Selenium waits. This method will stop the execution of the test casefor the
	//mentioned duration of time, irrespective of whether the element is found or not 
		//on the web page.
		
	//Dynamic Wait
	//1.Implicit Wait 
	//It is applicable on a complelete web-page 
	//If the application we're working on has 4-5 pages to upload 1 after another
	//then implicit waits can be used as it will wait for a particular seconds 
	//before each page uploads & we have to mention(write) the syntax only once
		
	//implicit Wait directs the Selenium WebDriver to wait for a certain measure of time 
	//before throwing an exception. Once this time is set, WebDriver will wait for the 
	//element before the exception occurs.
  //Once the command is run, Implicit Wait remains for the entire duration for which the 
		//browser is open. It’s default setting is 0
		
	//Explicit Wait
	//It will work on a single web element
	//While working on a application, If there's a web-element which takes extra time to
	//upload at that time explicit wait can be used as it will wait for the element to
	//aapear on the application and further we will be able to take action
		
	//By using the Explicit Wait command, the WebDriver is directed to wait until a 
	//certain web-element occurs before proceeding with executing the code.

    //Setting Explicit Wait is important in cases where there are certain elements 
	//that naturally take more time to load. 
		
  //Explicit wait is more intelligent, but can only be applied for specified elements. 
  //However, it is an improvement on implicit wait since it allows the program to pause
	//for web-elements.
		
	//Fluent wait 
	//It will work on a single web element
	//parametr-->time(seconds)
	//paramter-->condition(isdisplyaed,isenabled,isselected)
	//frequency-->time(time in seconds)
	//2min train-->120sec(10)-->120/10-->12
	//In the past 2mins it will check 12 times if the train is arrived 
		
//Fluent Wait in Selenium marks the maximum amount of time for Selenium WebDriver
//to wait for a certain (web element)to becomes visible. It also defines
//how frequently WebDriver will check if the web element appears before throwing the 
	//“ElementNotVisibleException”.

 //simply, Fluent Wait looks for a web element repeatedly at regular intervals
 //until timeout happens or until the object is found.

//Fluent Wait commands are most useful when interacting with web elements that can take
//longer durations to load. 
		
//While using Fluent Wait, it is possible to set a default polling period as needed. 
//The user can configure the wait to ignore any exceptions during the polling period.

//Fluent waits are also sometimes called smart waits because they don’t wait out the 
//entire duration defined in the code. Instead, the test continues to execute as soon 
//as the element is detected – as soon as the condition specified in
//.until(YourCondition) method becomes true.
	
	//.ignoring method to ingnore any exception during the excecution 
	//synatx-->.ignoring(exceptionName)	
		
	//combination of implicit & explicit wait -->
	//implicit wait will work on how many pages are there in the application & will wait
	//for each page to upload 
	//explicit wait will on the particular web element to upload & perform some action 
	//on it accordingly 
		
		
		
		
		
		
		

	}

}
