package selenium_use_Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollIntoViewPracticePage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://devexpress.github.io/testcafe/example/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement checkBox = driver.findElement(By.id("tried-test-cafe"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()", checkBox);
		System.out.println("scrolled dowm to the webElement");
		
		Thread.sleep(5000);
		checkBox.click();
		System.out.println("checked the checkBox");
		
		Actions act=new Actions(driver);
		
		WebElement dragAndDrop = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui')]"));
		WebElement release = driver.findElement(By.xpath("//div[contains(text(),'6')]"));
		Thread.sleep(5000);
		act.clickAndHold(dragAndDrop).perform();
		Thread.sleep(2000);
		act.release(release).perform();
		System.out.println("drag and drop action performed");
		
		driver.close();
	}

}
