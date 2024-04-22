package logical_Programs;

import java.util.Scanner;

public class PrimeNumUsingScanner {

	public static void main(String[] args)
	{
		System.out.println("please enter the number");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}	
		}
		if(count>=1)
		{
			System.out.println("given number is not a prime");
		}
		else
		{
			System.out.println("given number is a prime number");
		}
	}

}
