package string_study;

public class String_Builder {
	
//string builder was introduced in java 1.5

	public String_Builder(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		StringBuilder s=new StringBuilder("vaish");
		
		StringBuilder s1=new StringBuilder("vaishnavi");
		
		
		StringBuilder s3=new StringBuilder();
		
		System.out.println(s.charAt(1));//Returns the char value in this sequence at the specified index.
		//The first char value is at index 0, the next at index 1, and so on, as in array index-->a
		
		//System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException
		
		System.out.println(s.equals(s1));//???
	    System.out.println("========================");
	    
		System.out.println(s.indexOf("h"));//returns the index of the string 
		System.out.println(s1.indexOf("a"));//if duplicate is there returns the 1sr one 
		System.out.println("=======================");
		
		System.out.println(s3.isEmpty());//Returns true if this character sequence is empty
		System.out.println("==========================");
		
		System.out.println(s1.lastIndexOf("a"));
		System.out.println("=======================");
		
		System.out.println(s.length());//5-->vaish-->total no. of characters
		System.out.println(s1.length());//9
		System.out.println(s3.length());//0
		System.out.println("==========================");
		
		
		
		

	}

}
