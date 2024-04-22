package selenium_Use_Explicitwait_practicePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisplayButton {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("display-other-button")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enabled']"));
		wait.until(ExpectedConditions.visibilityOf(enableButton));
		
		if(enableButton.isDisplayed())
		{
			System.out.println("enable button is visble...TC is passed");
		}
		else
		{
			System.out.println("enable button is not visble...TC is failed");
		}
		
		driver.close();
		

	}

}
