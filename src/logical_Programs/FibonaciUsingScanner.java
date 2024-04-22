package logical_Programs;

import java.util.Scanner;

public class FibonaciUsingScanner {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 1st number");
		int num1 = sc.nextInt();
		
		System.out.println("enter the 2nd number");
		int num2 = sc.nextInt();
		
		System.out.println("enter the limit");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			int sum = num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(num1+" ");
		}
		
		
		

	}

}
