package logical_Programs;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
      int num=10;
      int count = 0;

      for(int i=2;i<num;i++)
      {
    	if(num%i==0)
    	{
    		count++;
    		break;
    	}
      }
      if(count>=1)
      {
    	  System.out.println("given num is not a prime number");
      }
      else
      {
    	  System.out.println("given num is prime number");
      }

	}

}
