package polymorphism;

public class Mother
{
	
    public void looks() 
    {
    	System.out.println("mothers having traditional looks");
    }
    
    public void kitchen ()
	{
		System.out.println("mothers having traditional recepies");//overriding havr the same method name but diiferent definations 
	}
	
    //  Method overriding: 
    //	Acquiring super class method into sub class with the help of extends keyword 
    //  & changing implementation/definition according to subclass specification is 
    //  called method overriding

}