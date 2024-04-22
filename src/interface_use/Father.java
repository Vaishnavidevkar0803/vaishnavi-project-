package interface_use;

public interface Father
{
 default void manners()
{
	System.out.println("fathers manners");
}

static void behaviour()
{
	System.out.println("rude behaviour");
}
  default void love()
  {
	  System.out.println("fathers love");
  }
  void strict();
 
  
//in interface all methods are public & abstract by default threfore 100% abstrcation is available 
  //all variables are final & static 
  //final-->cannot ressign the value
  //static-->cannot create the object 
  //constructor concept does not exits in interface 
  //100% incomplete methods and abstract
  //if we have to give defination or body to the method that meams we brk the legacy
}//from java version 8 jav has its legacy of having only incomplete methods 
//there are 3 ways to acheive the interface 
//by making the method as a default or as a static or by removing the body 
