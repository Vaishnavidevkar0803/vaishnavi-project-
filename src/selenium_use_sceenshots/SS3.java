package selenium_use_sceenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS3 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		String st=RandomString.make(2);
		
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
		System.out.println(timestamp);//on which time ss has taken(2024-03-16 12:44:40)
		
		File dest=new File("C:\\Users\\admin\\Pictures\\screenshots\\instaimage"+st+".png");
		
		FileHandler.copy(src, dest);
		
		driver.close();
			
		
		
	}

}
