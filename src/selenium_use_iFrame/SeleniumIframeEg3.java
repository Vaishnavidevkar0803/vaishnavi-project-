package selenium_use_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIframeEg3 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Iframe");
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("(//h5[text()='iFrame Demo'])[1]")).getText();
		System.out.println("text from the iframe is "+text);
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		WebElement button = driver.findElement(By.xpath("(//a[text()='Iframe with in an Iframe'])[1]"));
		System.out.println(button.isDisplayed()+" status of the button is this");
		
		driver.close();

	}

}
