package selenium_Use_POPUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selenium_use.Scroll_Down;

public class AlertPopUpEg2 {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println("launching the url");
	
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("window.scroll(0,3000)");
	
	//Actions act=new Actions(driver);
	
	WebElement clickMe = driver.findElement(By.id("promtButton"));
	clickMe.click();
	//act.scrollToElement(clickMe).click().build().perform();
    Thread.sleep(3000);
	System.out.println("clicked on the click me button");
	
	Alert clickmeButton=driver.switchTo().alert();
	Thread.sleep(7000);
	clickmeButton.sendKeys("vaishnavi Devkar");
	System.out.println("type arguments in text box");
	Thread.sleep(7000);
	clickmeButton.accept();
	System.out.println("clicked on the ok button");
	
	Thread.sleep(5000);
	driver.close();
	System.out.println("browser closed");
	
	
	
	

	}

}
