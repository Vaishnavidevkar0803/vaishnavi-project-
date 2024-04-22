package selenium_use_Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderEg2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/sliders/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("browser lUNCHED");

		WebElement iFrame = driver.findElement(By.xpath("(//iframe[@width='700'])[1]"));
		driver.switchTo().frame(iFrame);
		Thread.sleep(1000);
		System.out.println("switching from paraent frame to child frame");
		WebElement blueSlider = driver.findElement(By.xpath("//div[@id='blue']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(blueSlider);
		System.out.println("move towards the blue slider");
		Thread.sleep(5000);
		act.dragAndDropBy(blueSlider, 100, 0).perform();
		System.out.println("move slider to the left--->X-axis");
		Thread.sleep(3000);
		
		
		driver.close();
		System.out.println("closing the browser");
	}

}
