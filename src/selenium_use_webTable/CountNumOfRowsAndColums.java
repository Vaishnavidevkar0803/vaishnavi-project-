package selenium_use_webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNumOfRowsAndColums {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		 
		int CountOfRows = rows.size();
		
		System.out.println("This is the count of rows "+CountOfRows);//7
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		
		int countOfColumns = headers.size();
		
		System.out.println("This is the count of columns "+countOfColumns);//4
		
		driver.close();
	}

}
