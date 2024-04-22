package selenium_use_Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectMenu {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demoqa.com/menu/#");
	 driver.manage().window().maximize();
	 
	 //to scroll typecast driver
	 //int a=(int)b;
//	 JavascriptExecutor js=(JavascriptExecutor)driver;
//	 js.executeScript("window.scrollBy(0,400)");
//	 Thread.sleep(2000);
	 
	  Actions act =new Actions(driver);
	  
	  WebElement menu1 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	  act.click(menu1).perform();
	  Thread.sleep(2000);
	  
	  WebElement menu2 = driver.findElement(By.xpath("//div[contains(@style,'border: 1px solid rgb')]"));
	  //act.click(menu2).perform();
	  act.scrollToElement(menu2).perform();
	  Thread.sleep(2000);
	  
	  WebElement menu3 = driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));
	 // act.click(menu3).perform();
	  act.scrollToElement(menu3);
	  Thread.sleep(2000);
	 

	}

}
