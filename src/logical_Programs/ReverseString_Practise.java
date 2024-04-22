package logical_Programs;

import java.util.Scanner;

public class ReverseString_Practise {

	public static void main(String[] args)
	{
		System.out.println("please enter the phrase to be reversed");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	    
		String reverse = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		
		System.out.println("original phrase is "+s);
		
		System.out.println("reversed phrase is "+reverse);
		
		//InputMismatchException-->It is specific for the Scanner The exception can occur when the input 
		//is invalid for the expected type. The input either does not match 
		//the pattern for the expected type, or is out of range

	}

}
