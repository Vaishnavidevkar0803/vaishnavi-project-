package selenium_Use_Explicitwait_practicePage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUpPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(4000);
		System.out.println("url launched");
		
		WebElement alt = driver.findElement(By.id("alert"));
		alt.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert popUp = driver.switchTo().alert();
		System.out.println("switched focus to the Alert-PopUp");
		
		String text = popUp.getText();
		System.out.println(text+" is the text value from the PopUp");
		
		Thread.sleep(2000);
		popUp.accept();
		System.out.println("alert got captured sucessfully");
		
		driver.close();
		System.out.println("closing the browser");

		
		
		
	}

}
