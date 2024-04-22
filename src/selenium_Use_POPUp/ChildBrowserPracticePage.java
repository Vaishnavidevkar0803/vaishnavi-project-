package selenium_Use_POPUp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPracticePage {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
		Set<String> idOfMainPage = driver.getWindowHandles();
		System.out.println("id of the main page is "+idOfMainPage);
		
		Set<String> allwindowIds = driver.getWindowHandles();
		
		Iterator<String> iterateThroughWindows = allwindowIds.iterator();
		
		String mainPageId = iterateThroughWindows.next();
		String childPageId = iterateThroughWindows.next();
		
		System.out.println("Id of the child Browser "+childPageId);
		System.out.println("Id of the main page is "+mainPageId);
		
		driver.switchTo().window(childPageId);//child browser id
		Thread.sleep(2000);
		
		String urlOfChildBrowser = driver.getCurrentUrl();
		System.out.println(urlOfChildBrowser+ " is the url of the child Browser");
		
		String text = driver.findElement(By.xpath("//h1[contains(text(),'This is a ')]")).getText();
		System.out.println("text from the child browser is "+text);
		
		driver.close();
		
		
		
		
	}

}
