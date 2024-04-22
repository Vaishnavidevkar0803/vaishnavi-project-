package selenium_use_synchronization_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		driver.findElement(By.name("mobileNumber")).sendKeys("98483763752");
		
		WebElement getOtp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(getOtp)).click();
		
		driver.findElement(By.xpath("//input[@placeholder='OTP']")).sendKeys("675467");
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//explicit wait
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(5));
		Thread.sleep(4000);
		wait1.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
		
		driver.close();
		Thread.sleep(3000);
		System.out.println("run suessfully");
	}

}
