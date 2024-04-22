package logical_Programs;

import java.util.Scanner;

public class ReverseStringwithScanner {

	public static void main(String[] args)
	{
		System.out.println("please enter the phrase");
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		String rev = "";
		
		//reverse the string-->for loop
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("original string is "+s);
		
		System.out.println("reversed string is "+rev);

	}

}
