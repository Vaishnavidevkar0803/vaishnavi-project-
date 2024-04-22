package logical_Programs;

import java.util.Scanner;

public class ArmStrongNumUsingScanner {

	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem = i%10;
			sum=sum+(rem*rem*rem);
		}


	
	if(num==sum)
	{
		System.out.println("given num is a armstrong number");
	}
	else
	{
		System.out.println("given number is not a armstrong number");
	}

}
}
