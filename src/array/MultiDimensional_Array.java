package array;

public class MultiDimensional_Array {

	public static void main(String[] args)
	{
		int num[][]= {{1,2,3},{4,5,6},{7,8,9}};//3/3 3-->rows 3-->columns
		
		
		//nested for loop 
		for(int i=0;i<=num.length-1;i++)//outer for loop--> row 
		{
			for(int j=0;j<=num.length-1;j++)//inner for loop-->column
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
