package pattern;

public class EquilateralUpward {

	public static void main(String[] args) 
	{
//		   *
//		 * * *
//	    * * * * *
//	  * * * * * * *
//  no. of rows= 4;  no of colums=7; stars in 1st row=1;
		
		int star=1;
		int space=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for (int k=1;k<=star;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
			star=star+2;
			space--;
		}
}
}

