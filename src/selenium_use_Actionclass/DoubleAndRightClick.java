package selenium_use_Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndRightClick {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//typeCast driver into javascriptExecutor
	    js.executeScript("window.scrollBy(0,300)");
		
	    Actions act=new Actions(driver);
	    
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		act.doubleClick(doubleClick).perform();
		
		WebElement rightClickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		 act.moveToElement(rightClickButton).contextClick().build().perform();
		    Thread.sleep(5000);
		    
	    WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
	    act.moveToElement(clickMe).click().build().perform();
	  
	    Thread.sleep(4000);
	    driver.close();

	}

}
