package selenium_use_Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBookActionPerformed {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("browser has launched");
		
		Actions act =new Actions(driver);
		
		WebElement username = driver.findElement(By.id("email"));
		act.moveToElement(username).click().perform();
		Thread.sleep(500);
		act.keyDown(Keys.SHIFT).sendKeys("vaishnavi").perform();//VAISHNAVI
		System.out.println("enterd username in captical letters");
		
		WebElement text = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		act.moveToElement(text).doubleClick().build().perform();
		Thread.sleep(500);
		System.out.println("double clicked on the text");
		
		WebElement loginbutton = driver.findElement(By.id("u_0_5_mO"));
		act.contextClick(loginbutton).perform();
		Thread.sleep(500);
		System.out.println("right clicked on the login button");

		driver.close();
	}

}
