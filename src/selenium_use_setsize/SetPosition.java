package selenium_use_setsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	
	public static void main(String[] args) throws InterruptedException
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       Dimension defaultSize = driver.manage().window().getSize();
       System.out.println(defaultSize);
       Thread.sleep(2000);
       System.out.println("getting default size of the web page"+defaultSize);
       //getting default size of the web page(1050, 708)(int x,int y)
       
       Dimension d=new Dimension(600, 300);
       driver.manage().window().setSize(d);
       System.out.println("size has been chnaged from the default size");
       
       Thread.sleep(2000);
       driver.close();
       System.out.println("closing the browser");
       
       
       
       
       
       
       
      
       
       
	}

}
