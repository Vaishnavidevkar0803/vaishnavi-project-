package selenium_Use_POPUp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserWindow {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get text from main page
		WebElement mainPageText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println("text from the main page is "+mainPageText.getText());
		
		//clicking on new window tab
		driver.findElement(By.name("NewWindow")).click();
		
		//get the id of the main page
		String idOfMainPage = driver.getWindowHandle();
		System.out.println("main page id is "+idOfMainPage);
		
		//use getWindowHandles to get all window ids
	    Set<String> allWindowIds = driver.getWindowHandles();
	     
	    Iterator<String> it = allWindowIds.iterator();
	    
	    String mainPageId = it.next();
	    String chilPagedId = it.next();//windowId
	    
	    System.out.println("id of a main page is "+mainPageId);
	    System.out.println("id of a child page is "+chilPagedId);
	    
	    //switch to the child id
	    driver.switchTo().window(chilPagedId);//windowId
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   driver.findElement(By.id("the7-search")).sendKeys("hello");
	   System.out.println(driver.findElement(By.xpath("//h1[text()='About me']")).getText());
	   
	// again to work on main page--> we need to switch focus from child window to main page
	   
	   driver.switchTo().window(mainPageId);
	   //get text from main page
	   
	   Thread.sleep(2000);
	   WebElement textFromMainPage = driver.findElement(By.xpath("//p[contains(text(),'new browser window')]"));
	   
	   Thread.sleep(5000);
	   System.out.println("text from main page is "+textFromMainPage.getText());
	   
	   driver.close();
	    

	}

}
