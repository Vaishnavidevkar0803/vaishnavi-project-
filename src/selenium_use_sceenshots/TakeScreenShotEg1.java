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

public class TakeScreenShotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bcci.tv/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		String st=RandomString.make(2);
		
		String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
		System.out.println(time);//2024-03-16 13:06:45
	
		File destination=new File("C:\\Users\\admin\\Pictures\\screenshots\\cricketimage "+st+".png");
		
		FileHandler.copy(source, destination);
		
		driver.close();
		
	//IOException is a checked exception in Java that indicates a problem while 
	//performing Input/Output (I/O) operations. This usually happens when a failure
	//occurs while performing read, write or search operations in files or directories.
	}

}
