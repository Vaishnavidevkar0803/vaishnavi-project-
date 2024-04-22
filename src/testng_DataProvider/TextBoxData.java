package testng_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TextBoxData 
{
	@DataProvider(name = "sanity")
	public static String[][] data()
	{
		String dataTextBox[][]= {{"vaish devkar","vaish@gmail.com","pune","akluj"},{"pranav devkar","pranav@gmail.com","mumbai","london"},{"rohini gore","rohini@gmail.com","solapur","canada"}};
		
		return dataTextBox;
	}
	
	@DataProvider(name = "smoke")
	public static String[][]data1()
	{
		String dataforTextBox[][]= {{"joey tribiaani","joey@gmaul.com","latina","UK"},{"chandler bing","sarcasm101@gmail.com","Taxes","spain"},{"rachel green","sexy@gmail.com","london","jameca"}};
		
		return dataforTextBox;
	}

}
