package selenium_use_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver =new ChromeDriver();
     driver.get("https://www.tutorialspoint.com/index.htm");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     System.out.println("browser launched");
     
     WebElement htmlWebElement = driver.findElement(By.xpath("(//button[@class='learn-button'])[7]"));
     
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("arguments[0].scrollIntoView()", htmlWebElement);
     System.out.println("scrolled down to the element");
     
     int horizontalView = htmlWebElement.getLocation().getX();
     System.out.println(horizontalView+" horizontal X-axis measurement");////690 horizontal X-axis measurement
     
     int verticalView = htmlWebElement.getLocation().getY();
     System.out.println(verticalView+" vertical Y-axis measurement");// 989 vertical Y-axis measurement
     
     Actions act=new Actions(driver);
     Thread.sleep(1000);
     act.doubleClick(htmlWebElement).perform();
     System.out.println("double clicked onto the webelement");
     
    
     Thread.sleep(1000);
     driver.close();
     System.out.println("closing the browser");
	}

}
