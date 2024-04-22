package testng_DataProvider;

import org.testng.annotations.DataProvider;

public class FB_DataProviderClass
{
	@DataProvider (name="sanity")
	public static String[][] fbDataSet()
	{
		String data[][]= {{"vaish","devkar","776545898"},{"pranav","gore","9988755643"},{"sahil","mulani","66553526378"}};
		
		return data;
	}
	
	@DataProvider(name="smoke")
	public static String[][] fbdataSet1()
	{
		String data[][]= {{"sufiya","shabai","8767659009"},{"snehal","deo","0997766433"},{"jennie","kim","5446879889"}};
		
		return data;
	}
	

}
