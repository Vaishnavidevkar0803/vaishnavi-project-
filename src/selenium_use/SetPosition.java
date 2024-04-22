package selenium_use;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Point position = driver.manage().window().getPosition();
		System.out.println(position);//(-8, -8)(x,y)
		Point p=new Point(4, 4);
		driver.manage().window().setPosition(p);
	}

}
