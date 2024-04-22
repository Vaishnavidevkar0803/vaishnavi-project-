package selenium_Use_POPUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisonPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		Thread.sleep(1000);
		System.out.println("launching the url");
		
		driver.findElement(By.className("cd-popup-trigger")).click();
		Thread.sleep(500);
		System.out.println("clicked on the popup");
		
		driver.findElement(By.className("alert")).click();
		Thread.sleep(500);
		System.out.println("clickd on the alert button");
		
		Alert handleAlert = driver.switchTo().alert();
		handleAlert.accept();
		Thread.sleep(500);
		System.out.println("handled alert popup by clicking on the ok button");
		
		driver.close();
		System.out.println("closing the browser");
		
		
	}

}
