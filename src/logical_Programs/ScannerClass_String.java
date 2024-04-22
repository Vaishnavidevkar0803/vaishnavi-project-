package logical_Programs;

import java.util.Scanner;

public class ScannerClass_String {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		//String firstname=scan.next();
		System.out.println("please enter the first name");
		String firstname=scan.next();
		
		//String lastname=scan.next();
		System.out.println("please enter the last name ");
		String lastname=scan.next();
		
		System.out.println("your full name is "+firstname+ " "+lastname );

	}

}
