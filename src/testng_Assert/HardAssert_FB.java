package testng_Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_FB 
{

	@Test
	public void fb()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	   boolean radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	   
	 //if female gender radio button, is selected then TC is PASSED else TC is failed
//	   System.out.println("Female Radio button status is
//	   "+radioButtonSelectionStatus);
//	   
//	   if(radioButton)
//	   {
//		   System.out.println("radio button is selected tc is passed");
//	   }
//	   else
//	   {
//		   System.out.println("radio button is not selected TC is failed");
//	   }
//		 
	   
	   Assert.assertTrue(radioButton, "radio button is not selected ,TC is failed");
		
		
		
	}
}
