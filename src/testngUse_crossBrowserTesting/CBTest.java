package testngUse_crossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTest
{
	@Parameters("bName")
	@Test
	public void Cb(String BrowserName) throws InterruptedException
	{
	   //WebDriver driver=new ChromeDriver();
		
		WebDriver driver=null;
		if(BrowserName.equals("chrome"))
		{
		   driver=new ChromeDriver();
		}
		
		else if(BrowserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("vaishnavi");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("devkar");
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("vaish@123");
		Thread.sleep(1000);
	}

}
