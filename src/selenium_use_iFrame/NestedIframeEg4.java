package selenium_use_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframeEg4 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		
		WebElement animalDropDown = driver.findElement(By.id("animals"));
		
		Select s=new Select(animalDropDown);
		s.selectByVisibleText("Avatar");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium iFrames");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
