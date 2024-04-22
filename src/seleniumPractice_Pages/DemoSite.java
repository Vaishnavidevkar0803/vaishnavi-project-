package seleniumPractice_Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoSite {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://devexpress.github.io/testcafe/example/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    System.out.println("url laiunched");
	    
	    driver.findElement(By.id("developer-name")).sendKeys("vaisjsh");
	    System.out.println("text box filled with string");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("populate")).click();
	    System.out.println("clicked on the populate button");
	    Thread.sleep(2000);
	    
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    System.out.println("alert popup handled");
	    
	    driver.findElement(By.id("linux")).click();
	    System.out.println("clicked on the linux");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("reusing-js-code")).click();
	    System.out.println("clicked on the checkBox1 ");
	    Thread.sleep(1000);
	    driver.findElement(By.id("traffic-markup-analysis")).click();
	    System.out.println("clicked on the checkBox2");
	    Thread.sleep(2000);
	    
	   WebElement dropDown = driver.findElement(By.id("preferred-interface"));
	   
	   Select s=new Select(dropDown);
	   s.selectByVisibleText("JavaScript API");
	   System.out.println("select java from dropDown");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("tried-test-cafe")).click();
	   System.out.println("clicked on the I have tried TestCafe checkBox");
	   Thread.sleep(2000);
	   
	   Actions act=new Actions(driver);
	   
	  WebElement source = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui')]"));
	  WebElement destination = driver.findElement(By.xpath("//div[text()='10']"));
	 
	  Thread.sleep(1000);
	  act.clickAndHold(source).release(destination).build().perform();
	  System.out.println("drag and drop action performed");
	 
	  driver.findElement(By.id("comments")).sendKeys("u sucks");
	  System.out.println("comment has been made");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.id("submit-button")).click();
	  System.out.println("clicked on the submit button");
	  
	 WebElement thankYou_Message = driver.findElement(By.id("article-header"));
	 
	 if(thankYou_Message.isDisplayed())
	 {
		 System.out.println("ThankYou message is displayed,testcase is passed");
		 driver.close();
	 }
	 
	 else
	 {
		 System.out.println("ThankYou message is not displayed,testCase is failed");
	 }
	}
	

}
