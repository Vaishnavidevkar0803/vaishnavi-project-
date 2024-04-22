package loops;

public class Reverse_TheTableOf_8 {

	public static void main(String[] args)
	{
		int j=8;
		System.out.println("table of 8");
		for(int i=1;i<=10;i++)
		{
			System.out.println(j+"*"+i+"="+j*i);
		}
		
		System.out.println("=========reverse the table of 8=========");

		int p=8;
		for(int q=10;q>=1;q--)
		{
			System.out.println(p+"*"+q+"="+p*q);
		}
	}

}
