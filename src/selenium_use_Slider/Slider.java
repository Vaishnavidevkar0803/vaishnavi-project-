package selenium_use_Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("browser launched");
		
		WebElement slide = driver.findElement(By.xpath("//div[@id='slider']"));
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		act.moveToElement(slide).perform();
		System.out.println("move to the web-element by using xpath");
		
		Thread.sleep(500);
		
		act.dragAndDropBy(slide, 100, 0).perform();
		System.out.println("slide to the left-->X-axis");
		
		driver.close();
		System.out.println("browser closed sucessfully done the sliding");
	}

}
