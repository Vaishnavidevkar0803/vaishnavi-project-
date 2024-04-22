package logical_Programs;

import java.util.Scanner;

public class ReverseNumbersWithScanner {

	public static void main(String[] args) 
	{
		System.out.println("enter the numbers u want to be reversed");
		
		Scanner sc=new Scanner(System.in);
		int s = sc.nextInt();
		String originalstring = Integer.toString(s);
		 String revnum = "";
		
		for(int i=originalstring.length()-1;i>=0;i--)
		{
			revnum=revnum+originalstring.charAt(i);
		}
		System.out.println("original numbers are "+originalstring);
		System.out.println("reversed numbers are "+revnum);
	}

}
