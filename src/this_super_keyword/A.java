package this_super_keyword;

public class A {
	
	int a=20;
	String s="vaish";//globally declared variables

	public static void main(String[] args)
	{
		A obj=new A();
		obj.disply();
		
	}
	
	public void disply()
	{
		int a=30;
	    String s="pranav";
	    System.out.println(a);
	    System.out.println(s);
	    System.out.println(this.a);
	    System.out.println(this.s);
	}

}
