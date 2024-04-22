package pattern;

public class Butterfly {

	public static void main(String[] args) 
	{
		//*          *
		//**        **
		//***      ***
		//****    ****
		//*****  *****
		//****    ****
		//***      ***
		//**        **
		//*          * ( Remember : Star Space Space Star)
		
		//no. of rows=9  ; 
		int star=1;//no. of stars in 1st row-->left side
		int space=4;//no. of space in left side 
		int star2=1;//no. of stars in 1st row-->right side 
		int space2=4;//no. of space in right side 
		
		for(int i=1;i<=9;i++)//no. of rows
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print("  ");
			}
			for(int l=1;l<=space2;l++)
			{
				System.out.print("  ");
			}
			for(int m=1;m<=star2;m++)
			{
				System.out.print(" *");
			}
			System.out.println();
			if(i<5)
			{
				star++;
				space--;
				star2++;
				space2--;
			}
			else
			{
				star--;
				space++;
				star2--;
				space2++;
			}
		}
	}

}
