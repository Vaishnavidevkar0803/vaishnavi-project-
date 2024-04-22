package testng_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoSiteMainPage 
{
	@Test(dataProvider = "friends" ,dataProviderClass = DemoSiteDataProvider.class)
	public void demosite(String firstName,String lastName,String email,String company,String textBox) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dataprovider.com/signup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.name("company")).sendKeys(company);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[contains(@name,'why_would_you_')]")).sendKeys(textBox);
		Thread.sleep(2000);
		
		WebElement selectOption = driver.findElement(By.xpath("//select[contains(@name,'how_did_you')]"));
		Select s=new Select(selectOption);
		s.selectByVisibleText("Google Search");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(4000);
		act.moveToElement(checkBox).click().build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}

}
