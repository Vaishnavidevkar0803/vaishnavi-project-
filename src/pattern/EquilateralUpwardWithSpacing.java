package pattern;

public class EquilateralUpwardWithSpacing {

	public static void main(String[] args)
	{
		// Equilateral Triangle Upward With Space
//		   * 
//		  * * 
//		 * * * 
//		* * * * 
		int star=1;
		int space=3;//no. of space in 1st row
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
			
		}
		

	}

}
