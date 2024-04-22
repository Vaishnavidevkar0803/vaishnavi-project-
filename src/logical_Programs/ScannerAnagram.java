package logical_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAnagram {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first phrase");
		String phrase1 = sc.next();
		
		System.out.println("enter the second phrase");
		String phrase2 = sc.next();
		
		char[] a = phrase1.toCharArray();
		char[] b = phrase2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result)
		{
			System.out.println("given string is anagram");
		}
		else
		{
			System.out.println("given string is not anagram");
		}
		
		
		
		
		
		
		

	}

}
