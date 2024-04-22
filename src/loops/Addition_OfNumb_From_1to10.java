package loops;

public class Addition_OfNumb_From_1to10 {

	public static void main(String[] args) 
	{
		//1+1=2
		//2+2=4
		//4+4=16
		//16+16=32
		//32+32=64
		
		int num1=1;
		int num2=1;
	    int sum =num1+num2;
		
	    for(int i=num1;i<=32;i++)
	    {
	    	for(int j=num2;j<=32;j++)
	    	{
	    		System.out.println(num1+"+"+num2+"="+sum);
	    	}
	    }

	}

}
