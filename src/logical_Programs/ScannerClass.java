package logical_Programs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=scan.nextInt();
		
		System.out.println("please enter the value of b");
		int b=scan.nextInt();
		
		int sum =a+b;
		System.out.println("addtition of the a & b is "+sum);
	}

}
//what is scanner why we use scanner instead of declaring the values to the variable 
//-->scanner is a java .util class it is used to get the input from the user & it is used to read the 
//data types such as int,double,string
//To use the Scanner class, you first need to create an object of the class. This can be done
//by passing the System.in object to the constructor of the Scanner class. The System.in object
//represents the standard input stream, which is usually the keyboard.
//Once you have created a Scanner object, you can use it to read input from the user. 
//The Scanner class provides a number of methods for reading different types of data. 
//For example, the nextInt() method can be used to read an integer from the user, and the 
//nextLine()
//method can be used to read a line of text from the user.
