package data_Provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramerterXMLPractice2 {
  @Parameters({"Email","Password"})
  @Test
  public void fb_accountParameter(String Email,String Password) throws InterruptedException 
  {

	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.linkText("Forgotten password?")).click();
	  Thread.sleep(500);
	  driver.findElement(By.name("email")).sendKeys(Email);
	  driver.findElement(By.name("pass")).sendKeys(Password);
	  Thread.sleep(500);
	  driver.findElement(By.linkText("Log in")).click();
	  Thread.sleep(1000);
	  driver.close();
	  
  }
}
