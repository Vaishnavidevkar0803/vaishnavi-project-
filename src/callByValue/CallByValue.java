package callByValue;

public class CallByValue {

	public static void main(String[] args)
	{
		int a=100;
		System.out.println(a);//100
		
		int b;
		b=a;
		System.out.println(b);//100
		
	    b=200;
		System.out.println(b);//200
		
		System.out.println(a);//100
		
		//In call by value we assign the value of a to the variable b by assignment 
		//operator "=", so b will take the value of a (100),but into next line we have
		//assigned new value to the b(200)and 1 variable can only store 1 value in it 
		//at a time so it replaces 100 by 200.
	}

}
