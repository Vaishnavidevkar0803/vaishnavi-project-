package selenium_use_synchronization_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_Practice {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
	driver.manage().window().maximize();
	
	//implicity wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//find element 
	driver.findElement(By.id("mobileNumber")).sendKeys("8765544376");
	
	Thread.sleep(3000);
	
	WebElement getOtp = driver.findElement(By.xpath("//button[@type='submit']"));
	
	Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(ElementNotInteractableException.class);
	
    wait.until(ExpectedConditions.elementToBeClickable(getOtp)).click();
    
    Thread.sleep(2000);
    
    driver.close();
    
    System.out.println("application getOtp button worked sucessfully");
	}

}
