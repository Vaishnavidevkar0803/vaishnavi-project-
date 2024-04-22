package pattern;

public class StarPattern {

	public static void main(String[] args) 
	{
		//Star vertical pattern 
		//3 steps 
		//1]how many rows & columns are there 
		//2]how many stars are there in 1st row 
		//3]
//		*
//		*        -->vertical star pattern 
//		*
//		*
		
		//no of rows-->4   no.of cloums-->4  how many stars are there in 1st row 1
		System.out.println("==========Vertical star pattern=================");
		for( int i=1;i<=4;i++)
		{
			System.out.println("*");
		}
		
		System.out.println("==========horizontal star pattern=================");
		//* * * * * *
		for (int i=1;i<=6;i++)
		{
			System.out.print("*"+" ");
		}
		
      
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		System.out.println("===============star box pattern============");
		for(int i=1;i<=4;i++)//outer loop--> row 
		{
			for(int j=1;j<=5;j++)//inner loop--> columns
			{
				System.out.print("*"+" ");//remover ln (only print)
			}
			System.out.println();//blank priting statment 
		}
		 
		 
		

	}

}
