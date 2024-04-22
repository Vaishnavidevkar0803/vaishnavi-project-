package selenium_use_Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		WebElement dragMe = driver.findElement(By.id("draggable"));
		
		WebElement dropMe = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(dragMe, dropMe).perform();
		act.scrollToElement(dropMe);
       // act.clickAndHold(dragMe).moveToElement(dropMe).release().build().perform();
		
		//both methods work 
		driver.close();
	}

}
