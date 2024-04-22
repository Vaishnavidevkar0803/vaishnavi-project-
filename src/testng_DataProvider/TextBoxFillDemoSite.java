package testng_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TextBoxFillDemoSite 
{
	@Test(dataProvider = "smoke" ,dataProviderClass = TextBoxData.class)
	public void textBox(String fullName,String email,String currentAddress,String PermentAddress) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(fullName);
		Thread.sleep(2000);
		
		driver.findElement(By.id("userEmail")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys(currentAddress);
		Thread.sleep(2000);
		
		driver.findElement(By.id("permanentAddress")).sendKeys(PermentAddress);
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
