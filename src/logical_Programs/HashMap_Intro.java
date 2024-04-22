package logical_Programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Intro {

	public static void main(String[] args) 
	{
	HashMap<Integer, String> hp=new HashMap<Integer, String>();//<key ,value>
	
	hp.put(1, "vaish");
	hp.put(2, "pranav");
	hp.put(3, "teena");
	hp.put(4, "rahul");
	hp.put(5, "anjali");
	
	System.out.println(hp);
	
	System.out.println(hp.get(2));//Returns the value to which the specified key is mapped,or
	//null if this map contains no mapping for the key. -->>pranav 
	
	System.out.println(hp.get(8));//null 
	
	System.out.println(hp.containsKey(3));//returns true if the key is present -->true
	
	System.out.println(hp.containsValue("sahil"));//retuens true if the value is present -->false
	
	Set<Entry<Integer, String>> set = hp.entrySet();//a set view of the mappings contained in this map
	
	//use for each loop for traversing
	
	for(Entry<Integer, String> setmap:set)
	{
		System.out.println(setmap);
		System.out.println("===================");
		System.out.println(setmap.getValue());
		System.out.println("=======================");
		System.out.println(setmap.getKey());
		
	}
				
	
	}

}
