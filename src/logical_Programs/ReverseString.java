package logical_Programs;

public class ReverseString {

	public static void main(String[] args)
	{
		String s="vaish";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
		    rev=rev+s.charAt(i);	
		}
		System.out.println("original string is "+s);
		
		System.out.println("reversed string is "+rev);

	}

}
