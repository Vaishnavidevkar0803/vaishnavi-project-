package selenium_use_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeEg3 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframe 2");
	    driver.findElement(By.id("u_5_6")).click();//??
	    
		
	}

}
