package logical_Programs;

public class ReverseNumbers {

	public static void main(String[] args) 
	{
     int num=12457656;
    String oristring = Integer.toString(num);
      String rev = "";
      
      for(int i=oristring.length()-1;i>=0;i--)
      {
    	  rev=rev+oristring.charAt(i);
      }
      int reversednum = Integer.parseInt(rev);
      System.out.println("original numbers are "+num);
      System.out.println("reversed numbers are "+reversednum);
	}
	//parse-->
//Converts the string representation of a number in a specified format to its 32-bit(size range) 
	//signed integer equivalent. 
	
//Returns:the integer value represented by the argument in decimal.
//Throws:NumberFormatException - if the string does not contain a parsable integer.
	
	//NumberFormatException -->
	//Thrown to indicate that the application has attempted to convert a string to one of the numeric 
	//types, but that the string does not have the appropriate format
//occurs when an attempt is made to convert a string with improper format into a numeric value.
//That means, when it is not possible to convert a string in any numeric type (float, int, etc), 
//this exception is thrown. It is a Runtime Exception (Unchecked Exception) in Java.
}
