package exception;

public class Exception
{
//01.Out Of Bounds Exception:
//@String>>>CharAt.
//Value We Entered Is Bigger Than Present Index.
//String y5="Sangola";
//System.out.println(y5);
//System.out.println(y5.charAt(40));"out of bound exception"

//02.Unable To Locate:
//@Xpath
//Wrong Xpath{Copy the given Xpath and paste it in webpage locator}.
//Synchronization issue[max 7 sec=7000 or peformance issue i.e website is too slow testing can't be
//performed].
	

//03.Element Not Interactable:
//is an exception thrown by Selenium WebDriver when an element is present in the DOM,(document of module)
//but it is not interactable, meaning that the user cannot perform any action on it, 
//such as clicking or sending keys. This exception indicates that the element you are trying 
//to interact with is either hidden, disabled, or in a state that prevents user interaction.
//eg-->look at css class from selenium package


//04.Timeout exception
//In Selenium, a TimeoutException is an exception raised when an operation runs out after a specified
//period. For example, when using the WebDriver. get method to load a page, the default timeout is set to    
//30 seconds. If the page takes longer than 30 seconds to load, a TimeoutException will be raised.
//OTP
//Payment Time
//how to resolve it -->increase time for a longer period of time(thread.sleep)
	
//05.Socket exception:
//The socket is closed before all the data is read in the socket buffer.(Session suddenly closed)
//Internet connection is weak.The network connection is interrupted.
//The server is unreachable.
//how to resolve --> The "catch" block is used to handle the exception. It must be preceded by try block
//which means we can't use catch block alone. It can be followed by finally block later. The "finally" 
//block is used to execute the necessary code of the program.
         

//06.session exception
 //session not created.
	
//07.Element Click Intercepted Exception:
//occurs when we attempt to click on an element in the webpage, but it becomes unsuccessful because 
//another element intercepts or covers the element we try to click.
//how to resolve -->use explicits wait , use scroll into view 

	
//12.Unhandled Alert Exception-->
//is thrown when it encounters an unhanded alert box popping out. You need to set your code to act 
//normally unless an alert box scenario is found.
//how to resolve it-->
//1. Void dismiss()-->driver.switchTo().alert().dismiss();-->cancel button
//2. Void accept()-->driver.switchTo().alert().accept();-->ok button
//3. String getText()-->driver.switchTo().alert().getText();-->to capture alert message

	
//07.Unhandled Exception:-->An unhandled exception is a software crash that occurs when a program or 
//application's code doesn't have appropriate handling exceptions
//It might leads to resource leaks, such as open database connections or Security: 
//Revealing detailed error information, especially in web applications, can expose vulnerabilities. 
//Proper exception handling can prevent exposing sensitive information
	
	
//08.Class Cast Exception:
//It is a runtime exception that occurs when the application code attempts to cast an object to another
//class of which the original object is not an instance. For example, a String object cannot be cast to
//an Integer object and attempting to do so will result in a ClassCastException
	

//09.Null Point Exception[If Null Inserted in Treeset(Collection)]-->
//NullPointerException is a RuntimeException. In Java, a special null value can be assigned to an object 
//reference. NullPointerException is thrown when program attempts to use an object reference that has the
//null value.


//10.Stale Element Reference Exception
//Before clicking the element the element is no longer attached to DOM
//If it can not find the element in the current DOM, any action using that element any action on the
//element will leads to this exception
//An element goes stale when it was previously located, but can not be currently accessed. 
//Elements do not get relocated automatically
//COMMOM CAUSES-->
//You have refreshed the page, or the DOM of the page has dynamically changed.
//You have navigated to a different page.
//You have switched to another window or into or out of a frame or iframe.

//InputMismatchException-->It is specific for the Scanner The exception can occur when 
	//the input is invalid for the expected type. The input either does not match 
	//the pattern for the expected type, or is out of range
	
//NumberFormatException -->
//Thrown to indicate that the application has attempted to convert a string to one of the numeric 
//types, but that the string does not have the appropriate format
//occurs when an attempt is made to convert a string with improper format into a numeric value.
//That means, when it is not possible to convert a string in any numeric type (float, int, etc), 
	
	//IOException -->
	//is a checked exception that indicates a problem while 
	//performing Input/Output (I/O) operations. This usually happens when a failure
	//occurs while performing read, write or search operations in files or directories.
	
	//EncryptedDocumentException-->
     
}

