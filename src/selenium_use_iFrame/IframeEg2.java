package selenium_use_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        Thread.sleep(2000);
		
        driver.switchTo().frame("iframeResult");//(id),(name),(webelement),(index)
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(text.getText());
		
		driver.switchTo().defaultContent();//switching to main page
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
