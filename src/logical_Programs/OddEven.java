package logical_Programs;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the number");
		int a=scan.nextInt();
		
		int b=2;
		
		if(a%b==0)
		{
			System.out.println("the given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}
	}

}
