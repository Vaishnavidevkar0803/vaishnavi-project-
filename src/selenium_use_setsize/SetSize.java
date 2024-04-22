package selenium_use_setsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println("default size of the page is "+defaultsize);
		//default size of the page is (1050, 708)
		
		Dimension size=new Dimension(2000, 900);//(int width int height)
		driver.manage().window().setSize(size);
		System.out.println("set size of the webpage");
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("closing the browser");
	}
	

}
