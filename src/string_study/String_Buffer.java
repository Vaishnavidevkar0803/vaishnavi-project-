package string_study;

public class String_Buffer {
	//string buffer was introduced in java 1.0

	public static void main(String[] args) 
	{
		//1=append -->used to concate 2 strings 
		StringBuffer obj= new StringBuffer(" devkar");
		System.out.println(obj.append(" vaish"));
		System.out.println(obj.append(" prabhakar"));
		
		//2=insert-->The insert() method inserts the given String with this string at the given position.
		System.out.println(obj.insert(0, "name ="));
		
		//3=replace-->replaces the given String from the specified beginIndex and endIndex.
		System.out.println(obj.replace(5,6, "-->"));
		
		//4=delete-->The delete() method of the StringBuffer class deletes the String from the specified
		//beginIndex to endIndex.
		System.out.println(obj.delete(0, 4));// --> devkar vaish prabhakar
		
		//5=reverse-->reverses the current string.
		System.out.println(obj.reverse());//rakahbarp hsiav rakved >--
		
		//6=capacity-->returns the current capacity of the string buffer ,default capacity is 16,if the no.
		//of characters increses from its current capacity then it will increses by (old capacity*2)+2
		System.out.println(obj.capacity());
	//(old capacity*2)+2  =(22*4)+2  =48
		
		//7=ensure capacity-->The ensureCapacity() method of the StringBuffer class ensures that the given capacity is
//		the minimum to the current capacity. If it is greater than the current capacity, it increases
//		the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be
//		(16*2)+2=34.
		
		//8=

		

	}

}
