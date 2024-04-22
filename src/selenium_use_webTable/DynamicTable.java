package selenium_use_webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        int rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
       int colums = driver.findElements(By.xpath("//table[@class='dataTable']//tr/th")).size();
       
       for(int i=1;i<=rows;i++)
       {
    	   for(int j=1;j<=colums;j++)
    	   {
    		   if(i==1)
    		   {
    		   WebElement header = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/th["+j+"]"));
    		   System.out.print(header.getText()+" ");
    		   }
    		   else
    		   {
    			   WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
    			   System.out.print(data.getText()+" ");
    		   }
    	   }
    	   System.out.println();
       }
	}

}
