package selenium_use_Actionclass;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticePage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submitButton = driver.findElement(By.name("submit"));
		
		Actions at=new Actions(driver);
		at.sendKeys(userName, "vaishnavi").perform();
		Thread.sleep(2000);
		at.keyDown(Keys.SHIFT).sendKeys(password, "vaishnavi").build().perform();//??
		Thread.sleep(3000);
		at.click(submitButton).perform();
		
		driver.close();
		
		//keysDown-->pressShift
		
		
	}

}
