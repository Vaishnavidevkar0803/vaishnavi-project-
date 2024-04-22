package selenium_Use_Explicitwait_practicePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("checkbox")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement checkBox = driver.findElement(By.id("ch"));
		
		wait.until(ExpectedConditions.elementToBeSelected(checkBox));
		
		if(checkBox.isSelected())
		{
			System.out.println("checkBox is checked ...TC is passed");
		}
		
		else
		{
			System.out.println("checkBox is unchecked ...TC is failed");
		}
		
		driver.close();

	}

}
