package selenium_use_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIFrame {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		
		String mainPageText = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples')]")).getText();
		System.out.println("text from main page is "+mainPageText);
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iframe1");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		String textFromFrame2 = driver.findElement(By.xpath("//b[text()='Animals : ']")).getText();
		System.out.println("text from fram 2 is "+textFromFrame2);
		Thread.sleep(2000);
		
		//handle dropdown
		WebElement AnimalDropDown = driver.findElement(By.id("animals"));
		
		Select s=new Select(AnimalDropDown);
		s.selectByValue("babycat");
		
		driver.switchTo().defaultContent();
		String textFromPage = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println("main page text is "+textFromPage);
		Thread.sleep(3000);
		
		System.out.println("closing the browser");
		driver.close();
		
	}

}
