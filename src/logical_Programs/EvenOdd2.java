package logical_Programs;

import java.util.Scanner;

public class EvenOdd2 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter the Number");
		int num=scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}

	}

}
