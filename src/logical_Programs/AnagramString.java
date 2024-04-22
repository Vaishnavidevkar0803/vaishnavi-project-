package logical_Programs;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) 
	{
		//An anagram is a word or phrase that is created by rearranging the letters of another word or 
		//phrase--> Secure" is an anagram of "rescue

		String s="isha";
		String b="shai";
		
		char[]s1=s.toCharArray();//Converts this string to a new character array-->["i","s","h","a"]
		char[]b1=b.toCharArray();//["s","h","a","i"]
		
		Arrays.sort(s1);//[a h i s]
		Arrays.sort(b1);//a h i s]
		
		boolean result = Arrays.equals(s1, b1);
		
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
