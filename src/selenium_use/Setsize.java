package selenium_use;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {
	//in set size we used dimensions 
	

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		//return type of a getsize is Dimension
		System.out.println(size);//(1382, 744)
		Dimension d=new Dimension(500, 500);//(width height )
	    driver.manage().window().setSize(d);

	}

}
