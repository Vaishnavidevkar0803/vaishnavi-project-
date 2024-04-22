package logical_Programs;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindSecondLargestFromArray {

	public static void main(String[] args) 
	{
       int ar[]= {15,29,30,43,58,60,91,78,90};
       
       TreeSet<Integer> tr= new TreeSet<Integer>();
       for(int number:ar)//3,2,9,...
       {
       tr.add(number);//
       }
       System.out.println(ar);//complete tree set
       
       ArrayList<Integer> al=new ArrayList<Integer>(tr);
       
       System.out.println("second lowest number is "+al.get(1));
       
       System.out.println("second higest number is "+al.get(al.size()-2));
	}

}
