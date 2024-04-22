package selenium_use_Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy_Eg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement textMessage = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//type cast driver into JavascriptExecutor
		
		int verticalScroll = textMessage.getLocation().getY();//510
		System.out.println(verticalScroll);
		
		//js.executeScript("window.scrollBy(0,700)");
		
		js.executeScript("arguments[0].scrollIntoView()",textMessage);
		

	}

}
