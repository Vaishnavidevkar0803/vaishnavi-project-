package array;

import java.util.Arrays;

public class Eg3_SingleDimensional {

	public static void main(String[] args) 
	{
		String[] planets= {"earth","sun","moon","mars","pluto","saturn","jupiter","neptune","venus"};
		System.out.println("-------length of the string is-------------");
		System.out.println(planets.length);
		
		System.out.println("---------Travesing Through the Array-----------");
		for (int i=0;i<=planets.length-1;i++)
		{
			System.out.println(planets[i]);
		}
		
		System.out.println("---------Reverse the Array-----------");
		for (int j=planets.length-1;j>=0;j--)
		{
			System.out.println(planets[j]);
		}
		
		System.out.println("----------sorthing the array-----------");
		Arrays.sort(planets);
			
		System.out.println("--------------Array in Assending order---------");
		for (int i=0;i<=planets.length-1;i++)
		{
			System.out.println(planets[i]);
		}
		
		System.out.println("----------Array in Decending order----------");
		for (int q=planets.length-1;q>=0;q--) 
		{
			System.out.println(planets[q]);
		}

	}

}
