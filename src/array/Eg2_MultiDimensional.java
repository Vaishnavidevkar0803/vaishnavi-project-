package array;

import java.util.Arrays;


public class Eg2_MultiDimensional {

	public static void main(String[] args) 
	{
	String[][] animals= {{"lion","dog","cat"},{"tiger","cheeta","elephant"},{"rabbit","snake","crocodile"},
		{"bear","hippo","dragon"},{"deer","polar","bear"},{"fox","pig","fish"},{"cow","goat","monkey"}};
	
	System.out.println("------------length of the ARRAY-------------");
	System.out.println(animals.length);
	
	System.out.println("-------------Traversing through the array-------------");
	for(int i=0;i<=animals.length-1;i++)//outer-->row
	{
		for(int j=0;j<=animals.length-5;j++)//inner-->column
		{
			System.out.print(animals[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("-------------Traversing reverse through the Array-----------");
	for(int i=animals.length-1;i>=0;i--)
	{
		for(int j=animals.length-5;j>=0;j--)
		{
			System.out.print(animals[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("--------sorthing the array ------------");
	for(int i=0;i<=animals.length-1;i++)//sort row wise in multipledimensional array to get array in ascending order
	{
	Arrays.sort(animals[i]);
	}
	System.out.println("--------Array in Asscending Order--------");
	for(int i=0;i<=animals.length-1;i++)
	{
		for(int j=0;j<=animals.length-5;j++)
		{
			System.out.print(animals[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("-------------Dscecending order-----------");
	for(int i=animals.length-1;i>=0;i--)
	{
		for(int j=animals.length-5;j>=0;j--)
		{
			System.out.print(animals[i][j]+" ");
		}
		System.out.println();
	}
	//classCastException-->It is a runtime exception that occurs when the application code attempts 
	//to cast an object to another class of which the original object is not an instance.
	//For example, a String object cannot be cast to an Integer object and attempting
	//to do so will result in a ClassCastException .
	

	}

}
