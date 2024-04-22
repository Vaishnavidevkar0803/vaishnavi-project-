package pattern;

public class DiamondPattern {

	public static void main(String[] args)
	{
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		// no of rows=9  no of stars in 1st row =1;  no of colums-->9 spaces =4
		int star=1;
		int space=4;
		for( int i=1;i<=9;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
			star=star+2;
			space--;
			}
			else
			{
				star=star-2;
				space++;
				
			}
			}
		
		

	}

}
