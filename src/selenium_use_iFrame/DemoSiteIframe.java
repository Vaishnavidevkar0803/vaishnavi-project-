package selenium_use_iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteIframe {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement iframe = driver.findElement(By.xpath("//p[text()='iframe inside frame:']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='TCA6qd'])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@role='option'])[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@class='NPEfkd RveJvd snByac'])[2]")).click();
	}

}
