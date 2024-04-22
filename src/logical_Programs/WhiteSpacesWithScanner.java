package logical_Programs;

import java.util.Scanner;

public class WhiteSpacesWithScanner {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the phrase");
		String name = sc.nextLine();
		
		int counter = 0;
		for(int i=0;i<=name.length()-1;i++)
		{
			char ch = name.charAt(i);//Returns the char value at the specified index
			if(ch==' ')
			{
				counter++;
			}
		}
		System.out.println("count of white spaces are "+counter);
		
	}

}
