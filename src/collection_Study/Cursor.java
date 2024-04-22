package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursor {

	public static void main(String[] args) 
	{
		//cursor-->for traversing through collection of elements using objects
		//iterator(7)-->universal cursor -->only moves ahead -->unidirectional
		
		//list iterator(3)-->moves forward as well as backward-->bidirectional-->supports only list interface
		
		//enumeration(1)-->supports only vector -->legacy class-->as there were changes in all classes except vector 
		//so its a legacy class
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.size();
		System.out.println(al.size());
		al.add(10);
		al.add(8);
		al.add(30);
		al.add(21);
		System.out.println(al);
		System.out.println("***********************");
		Iterator<Integer> it = al.iterator();//-->it reference variable n it is object of arraylist
		//System.out.println(it.next());
		//-->next method is a abstract type
		//System.out.println(it.next());//next method moves cursor 1step forward
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
		//hashset method confirms if there is any element ahead 
		//returns boolean value
		System.out.println("----------------------");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===========list iterator============");
		
		ListIterator<Integer> lit = al.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.nextIndex());
		}

	}
	//Cursors in Collection
	
//	1. Iterator
//	All the collection object  --> Universal curser
//	Using Enumeration and iterator we can traverse collection object only in forward 
	//direction not a backward --> Single directional cursor
//	By using iterator we can perform only read and remove operations and we can not
	//perform replace and addition of new object.
	
	
//	2. list Iterator 
//	Only applicable for list interface type implementation classes  --> not universal
	//curser
//	Using list iterator we can traverse a List in forward direction and backward
	//direction--> bidirectional cursor
//	By using list Iterator we can perform read, remove, replace and addition of new 
	//object operations.
	
	
//	3. Enumeration 
//	Only applicable for legacy classes and hence it is not a universal cursor.
//	Using Enumeration and iterator we can traverse collection object only in forward 
	//direction not a backward --> Single directional cursor
//	By using enumeration we can get only read access.


}
