package selenium_use_Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropWithAction {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		act.clickAndHold(source).moveToElement(destination).release().build().perform();
		
			
			
		}
	}


