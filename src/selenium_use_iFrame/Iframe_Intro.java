package selenium_use_iFrame;

public class Iframe_Intro {

	public static void main(String[] args) 
	{
		//iFrame in Selenium Webdriver is a web page which is 
		//embedded (attached) in another web page.The iframe is often used to add 
		//content from other
		//sources like an advertisement into a web page. The iframe is defined with
		//the <iframe> tag.
		
		//Displaying a webpage as a part of a another webpage is known as iframe. 
		//Iframe will be created by using tagname iframe.
//		Procedure to handle iframe🡪 To handle iframe we need to switch selenium focus 
		//from main page to frame by using 
		
//		driver.switchTo(). frame("String Name or Id”)
		
//		We can switch to frame by 3 ways- i.e. id or name, index, or Webelement
//		Once action perform on elements present on  iframe, selenium will not navigate to
		//main page by default.
		
//		To navigate from iframe to main we need use method like parent or default 
		//content.
//		Driver.switchTo.parentframe(); → Child frame to immediate parent
//		Driver.switchTo.defaultcontent (); → Child frame to main page

		
	}

}
