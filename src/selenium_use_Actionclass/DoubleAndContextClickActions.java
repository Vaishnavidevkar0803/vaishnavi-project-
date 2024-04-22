package selenium_use_Actionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndContextClickActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		System.out.println("launched the url");
		Thread.sleep(2000);
		
		Actions act =new Actions(driver);
			
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightClick).perform();
		System.out.println("right clicked on the button");
		Thread.sleep(500);
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
		act.doubleClick(doubleClick).perform();
		System.out.println("double clicked on the button");
		Thread.sleep(2000);
		
	//there is alert pop up :how to handle alert popup
		//to handle the alert pop up we need to switch selenium focus from main page
		//to the alert pop up 
		
		Alert switchingfocus = driver.switchTo().alert();
		
		//alert is an interface ,it has only abstract methods 
		//means the methods do not contain defination (incomplete methods)
		
//		1. accept(): use to click on ok button.
//		2. dismiss(): use to click on cancel button.
//		3. getText(): use to get text present in an alert popup.
		
//		String text = switchingfocus.getText();
//		System.out.println(text);
		System.out.println(switchingfocus.getText()+" is the test from the alert popup");
		switchingfocus.accept();
		System.out.println("clicked on OKAY from the alert pop up");
		
		driver.close();
		System.out.println("closing the browser");
	}

}
