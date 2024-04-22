package selenium_use_sceenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;


public class GetScreenShot2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		String str=RandomString.make(5);
		
		String timestamps=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
		System.out.println(timestamps);//2024-03-16 13:04:20
		
		File destination=new File("C:\\Users\\admin\\Pictures\\screenshots\\fbimage "+str+".png");
		
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		
		driver.close();
		
		

				
			
		
	}



	}
