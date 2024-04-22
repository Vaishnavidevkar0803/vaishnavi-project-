package selenium_Use_POPUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteAlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://devexpress.github.io/testcafe/example/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("developer-name")).sendKeys("vaushn");
		Thread.sleep(2000);
		
		driver.findElement(By.id("populate")).click();
		Thread.sleep(2000);
		
		Alert alertpopUp = driver.switchTo().alert();
		alertpopUp.accept();
		
		Thread.sleep(2000);
		driver.close();

	}

}
