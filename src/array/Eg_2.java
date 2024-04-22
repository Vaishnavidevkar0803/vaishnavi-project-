package array;

import java.util.Arrays;

public class Eg_2 {

	public static void main(String[] args) 
	{
//		String name[]=new String[3];
//		name[0]="vaishnavi";
//		name[1]="sahil";
//		name[2]="ady";
		
		String name[]= {"vaishnavi","sahil","ady"};
		System.out.println(name.length);//3 get u the length
		System.out.println("name on the 0th index is");
		System.out.println(name[0]);//at 0th index what string name is -->vaishnavi
		
		System.out.println("travesing throgh the array");
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("sorting array");
		Arrays.sort(name);
		for(int i1=0;i1<=name.length-1;i1++)
		{
			System.out.println(name[i1]);
		}
		
		System.out.println("Decending order");
		for(int j=name.length-1;j>=0;j--)
		{
			System.out.println(name[j]);
		}
	}

}
