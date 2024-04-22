package selenium_use_webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		int numOfRows = driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println("There are total "+numOfRows+" num of rows in a table");
		
		int numOfColums = driver.findElements(By.xpath("//table[@id='countries']//tr[1]/td")).size();
		System.out.println("There are total "+numOfColums+" num of colums in a table");
		
		//read a header
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='countries']//tr[1]/td"));
		System.out.println("num of colums are as follows");
	    for(WebElement th:header)
	    {
	    	System.out.print(th.getText()+" ");
	    }
	    System.out.println();
	    
	    //read a random data from the table
	    
	   String data = driver.findElement(By.xpath("//table[@id='countries']//tr[2]/td[2]")).getText();
	   System.out.println("this is data from row no.2 and column no.2 "+data);
	   
	   //read a complete row
	   List<WebElement> row = driver.findElements(By.xpath("//table[@id='countries']//tr//td[3]"));
	   System.out.println("Reading a complete 3rd row");
	   for(WebElement r:row)
	   {
		   System.out.println(r.getText()+" ");
	   }
	   System.out.println();
	   
	   //read a complete table
	   int rows = driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
	   
	   int dataAll = driver.findElements(By.xpath("//table[@id='countries']//tr/td")).size();
	   System.out.println("=========read a table===========");
	   for(int i=1;i<=rows;i++)//rows
	   {
		   for(int j=1;j<=dataAll;j++)//columns
		   {
			 if(i==1)
			 {
				WebElement headeer = driver.findElement(By.xpath("//table[@id='countries']//tr[1]["+i+"]/td["+j+"]"));
				System.out.print(headeer.getText()+" ");
			 }
			 else
			 {
				WebElement restData = driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]/td["+j+"]"));
				System.out.print(restData.getText()+" ");//??
			 }
		   }
		   System.out.println();
	   }
		
		driver.close();

	}

}
