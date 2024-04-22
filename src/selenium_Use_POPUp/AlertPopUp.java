package selenium_Use_POPUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("launcing the url");
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		WebElement clickMe = driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));
			
		act.moveToElement(clickMe).click().build().perform();
		Thread.sleep(2000);
		System.out.println("clciked on the 1st clcik me button");
		
		Alert okButton = driver.switchTo().alert();
		Thread.sleep(2000);
		okButton.accept();
		System.out.println("you clicked on the okay button");
		
		driver.close();
		Thread.sleep(500);
		System.out.println("closing the url");
		

	}

}
