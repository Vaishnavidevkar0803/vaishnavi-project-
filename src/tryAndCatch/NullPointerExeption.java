package tryAndCatch;

public class NullPointerExeption 
{
	public static void main(String[] args) 
	{
	  String a="vaishnavi";
	  String b=null;
	  
	  try
	  {
		System.out.println(a.charAt(10));
	  } 
	  catch (StringIndexOutOfBoundsException e)
	  {
		System.out.println("check the length of the variable");
	  }
	  
	  System.out.println("hello vaishnavi");
	}

}
