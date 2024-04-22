package pattern;

public class EquilateralDownwardWithSpacing {

	public static void main(String[] args) 
	{
//		* * * * * * *
//		 * * * * *
//		   * * *
//		    * * 
//		     *
		 
//no. of rows-->5; no. of colums-->6  no of stars in 1st row-->7   space-->0
		
		int space=0;
		int star =7;
		for(int i=1;i<=5;i++)//for row
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star=star-2;
			space++;
		}
	}

}
