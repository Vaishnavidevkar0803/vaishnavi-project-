package testng_SerialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AjioTest 
{

	@Test
	public void ajio()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
	}
	

}
