package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewStudy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.naukri.com/");
		
		WebElement view = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;//int a=(int)b;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",view);
		Thread.sleep(2000);
		WebElement view2 = driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",view2);
		
        int xview2 = view2.getLocation().getX();//for location of view2
	    System.out.println(xview2);
	    int yview2 = view2.getLocation().getY();
	    System.out.println(yview2);
	    
	    int xview = view.getLocation().getX();
	    System.out.println(xview);
	    int yview = view.getLocation().getY();
	    System.out.println(yview);
	}

}
