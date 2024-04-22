package selenium_use_sceenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.bouncycastle.asn1.cms.TimeStampedData;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SSeg4 {

	public static void main(String[] args) throws IOException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
	String str=RandomString.make(4);//this will helps to avoid overwriting of ss
	
	String timestamp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
	System.out.println(timestamp);
	
	File destination=new File("C:\\Users\\admin\\Pictures\\screenshots\\amazon "+str+".png");
	
	FileHandler.copy(source, destination);
	
	driver.close();
	}

}
