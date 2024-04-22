package pattern;

public class TriangleLeftAscending {

	public static void main(String[] args)
	{
//	    *
//		* *
//		* * *
//		* * * *
//		* * * * *
		
	//no. of rows -->5  no. of colums-->5  no. of stars in 1st row-->1
		int star=1;//no. of star in 1st row 
		for(int i=1;i<=5;i++)//for rows
		{
			for(int j=1;j<=star;j++)//for colums
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			star++;
		}
		
	}

}
