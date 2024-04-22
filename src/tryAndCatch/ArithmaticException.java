package tryAndCatch;

public class ArithmaticException {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int div=0;
		
		try 
		{
			div=a/b;//risky code
			
		} 
		catch (ArithmeticException e)
		{
			System.out.println("please check the values of the variables must not be 0");
		}
		finally
		{
		System.out.println("ans is "+div);	
		}
		
	}

}
