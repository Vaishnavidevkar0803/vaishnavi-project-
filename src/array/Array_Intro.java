package array;

public class Array_Intro {

	public static void main(String[] args) 
	{
		//Array is a type of data structure used to store the homogenous type of information
		//inside array index present index starts from zero 
		//array is not growable in natrue (fix size)
		//array declaration can be done with the capacity 
		//it is nothing but an object
		//there are 2 types of array 
		//single dimensionl 
		//multi dimensional 
		
		String ar[]=new String[3];
		ar[0]="vaish";
		ar[1]="sahil";
		ar[2]="pranav";
		
	
		System.out.println(ar.length);
		System.out.println("---------------");
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("---------------");
		
		for(int j=2;j>=0;j--)
		{
			System.out.println(ar[j]);
		}
		System.out.println("--------------");
		
		for (int j1=0;j1<=ar.length-1;j1++)
		{
			System.out.println(ar[j1]);
		}
		
		

	}

}
 