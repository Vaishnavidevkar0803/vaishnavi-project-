package selenium_use_synchronization_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Thread.sleep(2000);
	WebElement enableButton = driver.findElement(By.id("enable-button"));
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(enableButton)).click();
	System.out.println("clicked on the button");
	
	boolean button = driver.findElement(By.id("disable")).isEnabled();
	
	Thread.sleep(2000);
	
	boolean Enabled = false;
	if(button==Enabled)
	{
      System.out.println("web-element is enabled hence the testcase is passed");
		
	}
	else
	{
		System.out.println("web-element is disabled hence the test case is failed");
		driver.close();
	}
	
	}

}
