package pattern;

public class TriangleLeftDecending {

	public static void main(String[] args) 
	{
//		* * * * *
//		* * * * 
//		* * *
//		* *
//		*
		//no of rows -->5  no.of colums-->5   no. of stars in 1st row-->5
		int star=5;//no of stars in 1st row
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=1;j<=star;j++)//colums
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			star--;
		}
		
		//Triangle Right Decending 
//		//* * * * *
//		    * * * *
//		      * * *
//		        * * 
//		          *
		//no of rows-->5  no of colums -->5
		int space=0;//space on the 1st row( there are no space)
		int star2 =5;//no. of stars on the 1st row 
		
		for(int i=1;i<=5;i++)//outer loop for rows
		{
			for(int j=1;j<=space;j++)//1st consider inner for loop for the Space
			{
				System.out.print(" ");//Use Single Space and on Print for Inner For Loop
			}
			for(int j1=1;j1<=star2;j1++)
			{
				System.out.print("*");
			}
			System.out.println();
			star2--;
			space++;
		}
		
	}

}
