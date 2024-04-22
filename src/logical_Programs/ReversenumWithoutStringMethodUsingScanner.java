package logical_Programs;

import java.util.Scanner;

public class ReversenumWithoutStringMethodUsingScanner {

	public static void main(String[] args) 
	{
		System.out.println("enter the number to be reversed");
		Scanner sc=new Scanner(System.in);
		int nextnum = sc.nextInt();
		int rev = 0;
		
		for(int i=nextnum;i>0;i=i/10)
		{
	           int remainder = i%10;
	           
	           rev=rev*10+remainder;
		}
		
		System.out.println("reversed number is "+rev);

	}

}
