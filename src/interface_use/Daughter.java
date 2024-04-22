package interface_use;

public class Daughter implements Father,Mother {

	public static void main(String[] args)
	{
		Daughter d=new Daughter();
		d.manners();
		d.looks();//calling non-static method from another class
		d.love();
		d.fashion();
		Father.behaviour();//classname.methodname
		Mother.cooking_skiils();//calling static method from another class
	}

	@Override
	public void love() 
	{
		Father.super.love();
		Mother.super.love();
	}

	@Override
	public void kind() 
	{
		System.out.println("kind mother");
		
	}

	@Override
	public void strict() 
	{
		
		System.out.println("strict father");
	}
	public void fashion()
	{
		System.out.println("good fashion sense");
	}

}
