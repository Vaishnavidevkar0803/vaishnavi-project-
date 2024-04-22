package abstract_use;

public class Concrete_Use extends Abstract_use
{
//add unimplemented methods to over-ride methods from abstract class 
	//1)go to the Concrete_Use class name and then add unimplemented methods
	public static void main(String[] args)
	{
		Concrete_Use c1=new Concrete_Use();
		c1.test4();
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void test4() 
//	{
//		System.out.println("completed in concrete class");
//		
//	}
	
	
	
	

}
