package logical_Programs;

public class ReversenumWithoutStringMethod {

	public static void main(String[] args)
	{
		int num=1234;
		int rev = 0;
		
		for(int i=num;i>0;i=i/10)//1234/10=123.4 -->123/10=12.3 -->12/10=1.2 -->1/10=0.1
		{
		     int remainder = i%10;//4,3,2,1
		     rev = rev*10+remainder;
		     //4=0*10+4
		     //43=4*10+3
		     //432=43*10+2
		     //4321=432*10+1
		}
	
		System.out.println(rev);
	}

}
