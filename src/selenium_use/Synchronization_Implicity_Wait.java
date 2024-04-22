package selenium_use;

public class Synchronization_Implicity_Wait {

	public static void main(String[] args) 
	{
	//intro
	//synochronization-->matching selenium test script speed with the browser/application
	//2 types of wait -->1)Static wait  2)Dynamic wait 
		
	//Static wait = wait time is fixed 
	//If in a test script there are 4 to 5 pages needs to upload  after another 
	//so before each page uploads we have to mention static wait-->Thread.sleep(500)
	//which will increases the steps in test script 
		
	//Dynamic Wait
	//1.Implicit Wait 
	//It is applicable on a complelete web-page 
	//If the application we're working on has 4-5 pages to upload 1 after another
	//then implicit waits can be used as it will wait for a particular seconds 
	//before each page uploads & we have to mention(write) the syntax only once
		
	//Explicit Wait
	//It will work on a single web element
	//While working on a application, If there's a web-element which takes extra time to
	//upload at that time explicit wait can be used as it will wait for the element to
	//aapear on the application and further we will be able to take action
		
	//Fluent wait 
	//It will work on a single web element
	//parametr-->time(seconds)
	//paramter-->condition(isdisplyaed,isenabled,isselected)
	//frequency-->time(time in seconds)
	//2min train-->120sec(10)-->120/10-->12
	//In the past 2mins it will check 12 times if the train is arrived 
	
	//.ignoring method to ingnore any exception during the excecution 
	//synatx-->.ignoring(exceptionName)	
		
	//combination of implicit & explicit wait -->
	//implicit wait will work on how many pages are there in the application & will wait
	//for each page to upload 
	//explicit wait will on the particular web element to upload & perform some action 
	//on it accordingly 
		
		
		
		
		
		
		

	}

}
