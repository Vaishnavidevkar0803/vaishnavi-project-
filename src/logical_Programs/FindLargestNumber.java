package logical_Programs;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindLargestNumber {

	
	public static void main(String[] args)
	{
		int ar[]= {12,9,45,99,78,90,21};
		
		TreeSet tr=new TreeSet();
		for(int num:ar)
		{
			tr.add(num);
		}
			//System.out.println(ar);
			
			ArrayList al=new ArrayList(tr);
			System.out.println("largest number is "+al.get(5));
		
	}

}
