package logical_Programs;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");//4
		int number=sc.nextInt();
		int fact=1;
		
		
		for(int i=number;i>=1;i--)//4-->3-->2-->1-->0
		{
			System.out.println(i);//4-->3-->2-->1
			fact=fact*i;//1*4=4-->4*3=12-->12*2=24-->24*1=24
		}
		System.out.println("the factorial of the "+ number+" is "+ fact);

	}

}
