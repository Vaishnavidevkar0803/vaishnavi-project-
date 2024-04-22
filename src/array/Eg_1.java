package array;

import java.util.Arrays;

public class Eg_1 {

	public static void main(String[] args) 
	{
		int rollno[]=new int[5];
		rollno[0]=12;
		rollno[1]=1;
		rollno[2]=10;
		rollno[3]=21;
		rollno[4]=2;
		
		for(int i=0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		
		Arrays.sort(rollno);//Sorts the specified array into ascending numerical order.
		
		System.out.println("sorted array");
		for(int j=0;j<=rollno.length-1;j++)
		{
			System.out.println(rollno[j]);
		}
		
		System.out.println("decending order");
		for(int j1=rollno.length-1;j1>=0;j1--)
		{
			System.out.println(rollno[j1]);
		}
		
		

	}

}
