package abstract_use;

public class ConcreteClass extends AbstractClass{

	public static void main(String[] args) 
	{
		ConcreteClass cc=new ConcreteClass();
		cc.username();
		cc.password();
	}

	@Override
	public void username() {
		System.out.println("vaishnavi");
		
	}

	@Override
	public void password() {
		System.out.println("vaish@123");
		
	}

}
