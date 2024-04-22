package testngDataProvider_XML;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demosite 
{
	@Parameters({"userName","emailId","currentAddress","permanentAddress"})
	@Test
	public void demosite(String username,String email,String current,String permanent) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("userName")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.id("userEmail")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.id("currentAddress")).sendKeys(current);
		Thread.sleep(2000);
		
		driver.findElement(By.id("permanentAddress")).sendKeys(permanent);
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
	}

}
