package selenium_use_webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_Use_Explicitwait_practicePage.Gettext;

public class Read_A_Table {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		
		for(int i=1;i<=rows;i++)//outer loop -->rows
		{
			for(int j=1;j<=columns;j++)//inner loop-->colums
			{
				if(i==1)
				{
					WebElement header = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
					System.out.print(header.getText()+" ");
				}
				else
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
					System.out.print(data.getText()+" ");
				}
			}
			System.out.println();
		}
		System.out.println("===========================");
	driver.close();

	}

}
