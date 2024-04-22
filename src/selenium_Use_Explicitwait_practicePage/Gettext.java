package selenium_Use_Explicitwait_practicePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gettext {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("url launched");
		
		driver.findElement(By.id("populate-text")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		
	//	wait.until(ExpectedConditions.textToBePresentInElementValue(null, null))
		
		System.out.println(" this is the text after 10sec wait");
		
		driver.close();
		
		
		
		
}
}
