package tryAndCatch;

public class Nullpointer {

	public static void main(String[] args) 
	{
		 String a="vaishnavi";
		  String b=null;
		  
		  try 
		  {
			  System.out.println(b.charAt(0));
			System.out.println(10/0);
		  } 
		  catch (NullPointerException e)
		  {
			System.out.println("check string should not be null");
			e.printStackTrace();
			//The printStackTrace() method in Java is a tool used to handle exceptions
			//and errors. It is a method of Java's throwable class which prints the 
			//throwable along with other details like the line number and class name
			//where the exception occurred. The printStackTrace() is very useful in 
			//diagnosing exceptions.
			//because it tells you what happened and where in the code.
		  }
		  catch (StringIndexOutOfBoundsException e) 
		  {
			System.out.println("check the length of the string");
		  }
		  catch (Exception e) 
		  {
			System.out.println("checkout there must be an exception");
		  }
		  System.out.println("gm");
	}

}
