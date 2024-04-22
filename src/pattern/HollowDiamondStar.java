package pattern;

public class HollowDiamondStar {

	public static void main(String[] args) 
	{
//	    *
//	   * *
//	  *   *
//	 *     *
//	*       *
//	 *     *
//	  *   *
//	   * *
//	    *
	// no of rows=9  no of stars in 1st row =1;  no of colums-->9 spaces =7
//star space star
		
//		}/ * 
//		 * 
//		 * row = 9
//		 * columns=9
//		 * star@F1=1
//		 * Space@F1=4
//		 * 
//		 * 
//		 */
		int star211=1;
		int space21l=4;
		int space21r=0;
		
		int star21r=0;
		
		for(int i=1;i<=9;i++) 
		{
			for(int j=1;j<=space21l;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star211;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=space21r;l++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=star21r;m++) 
			{
				System.out.print("*");
			}
	if(i<1||i==8) 
			{
				star21r=0;
			}
			else
			{
				star21r=1;
			}
			
			if(i<5) 
			{
			space21l--;
			
			
			}
			else 
			{
			space21l++;
			
			}
			if(i<2) 
			{
				space21r++;
			}
			else if(i<5&&i>1)
			{
				space21r=space21r+2;
			}
			else if(i<8 && i>=5) 
			{
				space21r=space21r-2;
			}
			else  
			{
				space21r=0;
			}
			System.out.println();
		}
	}

}

