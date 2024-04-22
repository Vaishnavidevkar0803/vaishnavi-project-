package pattern;

public class EquilateralDownard {

	public static void main(String[] args) 
	{
//		 * * * * * * *
//		   * * * * *
//		     * * *
//		       *
		//no. of rows-->5; colums= 7  ;no of stars in 1st row-->7  spaces-->6
		
		int star=7;
		int space=6;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
			star=star-2;
			space++;
		}

	}

}
