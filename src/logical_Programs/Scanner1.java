package logical_Programs;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the date of birth");
		int b=scan.nextInt();
		
		System.out.println("enter the month u were born in");
		String m=scan.next();
		
		System.out.println("enter the year");
		int y=scan.nextInt();
		
		System.out.println("your DOB is "+b+"-"+m+"-"+y);
		

	}

}
