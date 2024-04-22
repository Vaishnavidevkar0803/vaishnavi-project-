package pattern;

public class TriangleRightAscending {

	public static void main(String[] args) 
	{
//		  *      *
//		 **
//	    ***
//	   ****
//	  *****
	//no of rows-->5 no of colums=5  space-->4  no. of stars in 1st row-->1
		
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++)//outer forloop --> row
		{
			for(int i1=1;i1<=space;i1++)//space
			{
				System.out.print("  ");//2 spaces
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}
