package selenium_use_sceenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Practice_1 {

	public static void main(String[] args) throws IOException 
	{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       System.out.println(source);
       
       String str= RandomString.make(2);
       
       String timeStamp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
       System.out.println(timeStamp);
       
       File destination=new File("C:\\Users\\admin\\Pictures\\screenshots\\Youtube"+str+".png");
       
      org.openqa.selenium.io.FileHandler.copy(source, destination);
      
      driver.close();
       
	}

}
