package collection_Study;

import java.util.ArrayList;

public class Collection_Use {

	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<Object>();
		System.out.println(al.add("pune"));//Returns:true
		System.out.println("=============");
		System.out.println(al);
		System.out.println("***********");
		
		al.add(0, "katraj");
		System.out.println(al);
		//al.clear();
		//System.out.println(al);
		Object alnew=al.clone();//Returns a shallow copy of this ArrayList instance
		System.out.println(al);
		System.out.println("clone method is "+alnew);
		System.out.println("========================");
		System.out.println(al.contains("pune"));//returns boolean-->tue
		System.out.println(al.contains("nashik"));//false
		//Returns true if this list contains the specified element
		System.out.println("=======**========");
		al.ensureCapacity(3);// ensure that it can hold at least the number of elements specified 
		//by the minimum capacity argument.????????
		System.out.println("============");
		al.add("vaish");
		System.out.println(al);
		System.out.println("****************");
		System.out.println(alnew);
		System.out.println(al);
		
		//Returns:true if the specified object is equal to this list
		al.equals(alnew);
		System.out.println(al.equals(alnew));//false
		
		
		System.out.println("*******************");
		al.get(2);//string-->charat
		//Returns the element at the specified position in this list
		
		System.out.println(al.get(2));//-->vaish
		//System.out.println(al.get(29));// IndexOutOfBounds Exception Index 29 out of bounds for length 3
		System.out.println("***************");
		al.indexOf("vaish");
		System.out.println(al.indexOf("vaish"));//2 returns index of the element
		System.out.println(al.indexOf("vaishnavi"));//-1 element not exists
		System.out.println("**********************");
		
		
		//al.clear();
		System.out.println(al.isEmpty());//gives true ans if we use clear method return type is boolean
		
		
		System.out.println("*******************");
		al.lastIndexOf(1);
		System.out.println(al.lastIndexOf("vaish"));//pass element want to search-->2
		System.out.println(al.lastIndexOf("katraj"));//-->0
		System.out.println(al.lastIndexOf("pune"));//-->1
		System.out.println(al.lastIndexOf("banglore"));//-->-1
		System.out.println("********////*********");
		
		
		System.out.println(al);
		System.out.println(al.remove(1));//removes the object returns 1th index element
		//Returns:the element that was removed from the list
		System.out.println(al);
		System.out.println("==*************");
		
		
		al.set(1, "velocity");//Replaces the element at the specified position in
		//this list
		System.out.println(al.set(1, "velocity"));//it only replace the element 
		System.out.println(al);
		System.out.println("****************");
		
		
		al.size();//length
		//Returns the number of elements in this list
		System.out.println(al.size());
	}

}
