package selenium_use_webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_A_Column {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get a only one header 
		WebElement header = driver.findElement(By.xpath("//table[@name='BookTable']//tr/th[2]"));
		System.out.println("this is the header from row no.1 & column no.2-->"+header.getText());
		
		//whole row of header
		List<WebElement> wholeHeaderLine = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		
		System.out.println("headers value are as follows-->");
		for(WebElement head:wholeHeaderLine)
		{
			System.out.print(head.getText()+" ");
		}
		System.out.println();
		//print only 1 data from the table
		WebElement readData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[2]"));
		System.out.println("THis is the data of row num 4 and column no. 2 --> "+readData.getText());
		
		//read complete row from the table
		
		List<WebElement> readCompleteRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr[7]/td"));
		System.out.println("This are the values from last row-->");
		for(WebElement values:readCompleteRow)
		{
			System.out.print(values.getText()+" ");
		}
		System.out.println();
		
		System.out.println("========================");
		
		//read the whole column
		List<WebElement> thirdColumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[3]"));
		System.out.println("3rd column values are -->");
		for(WebElement td:thirdColumn)
		{
			System.out.println(td.getText());
		}
		System.out.println();
		
		System.out.println("========================");
		
		
		driver.close();

	}

}
