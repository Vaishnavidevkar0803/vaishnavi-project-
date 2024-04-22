package selenium_Use_Explicitwait_practicePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsEnabledButton {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.findElement(By.id("enable-button")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement disableButton = driver.findElement(By.id("disable"));
        
        wait.until(ExpectedConditions.visibilityOf(disableButton));
        
        if(disableButton.isEnabled())
        {
        	System.out.println("button is enabled ...TC is passed");
        }
        else
        {
        	System.out.println("button is disabled...TC is failed");
        }
        	
        
        driver.close();
        
	}

}
