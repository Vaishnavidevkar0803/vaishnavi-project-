package testng_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_DataAccount
{
	@Test(dataProvider = "smoke",dataProviderClass = FB_DataProviderClass.class)
	public void fbDta(String fristName,String LastName,String moiblenum) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys(fristName);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LastName);
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email__")).sendKeys(moiblenum);
		Thread.sleep(2000);
		
		driver.close();
	}

}
