package logical_Programs;

import java.util.Scanner;

public class RemoveVowels_UsingScanner {

	public static void main(String[] args) 
	{
		System.out.println("enter the phrase");
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		String  c="";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char v = s.charAt(i);
			
			if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u');
			{
				continue;
			}
			c=c+v;//?????
		}
		 System.out.println(s);
		   System.out.println(c);
		
	}

}
