package testng_DataProvider;

import java.util.jar.Attributes.Name;

import org.testng.annotations.DataProvider;

public class DemoSiteDataProvider {

	
	@DataProvider(name = "regression")
	public static String[][]data()
	{
		String dataProvider[][]= {{"vaish","devkar","v@gmail.com","TCS","nice"},{"pana","deo","p@gmail.com","TATA","hardwork"},{"sahil","mulani","s@gmail.com","wipro","best"},{"rohini","gore","r@gmail.com","google","good"}};
		
		
		return dataProvider ;
	}
	
	@DataProvider(name = "friends")
	public static String[][] data1()
	{
		String dataProvider[][]= {{"monica","geller","m@gmail.com","cooking","seven seven seven!!!"},{"chandler","bing","c@gmail.com","sarcasm101","too many jokes"},{"joey","tribianni","j@gmail.com","Doctor","I'M curvy and I like it"},{"ross","geller","r@gmail.com","dinosourous","we were on a break!!!!"},{"rachel","green","rr@gmail.com","gucci","Guccci wants meee!!"},{"phoebe","buffay","pp@gmail.com","sauna","I don;t need u or anybody I'm gonna make on my Own!!"}};
		
		return dataProvider;
	}
}
