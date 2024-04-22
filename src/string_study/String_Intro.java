package string_study;

public class String_Intro {

	public static void main(String[] args) 
	{
		//constant pool area
		String s="old value";//(garbage value it will gets collected by java garbage collector)
		 s="new value";
        System.out.println(s);
     //   why string objects are immutable in natrue ??
     //   there are 2 variables both have diiferent values but the objects are same (s)as the string
     //   is immutable in natrue it will create a space for the old value in constatnt pool area 
     //   java will simply refer the s object to the new value ...what happens to the old value 
     //it gets collected by the java garbage collector 
     //editing or replacing ,overridden concept doesnt exits in string 
        
        //non constant pool area 
       String s1=new String("old value");
       s1=new String("new value");
       System.out.println(s1);
       
       String h=new String("hello");
       h.concat("world");
       System.out.println(h);
      
	}

}
