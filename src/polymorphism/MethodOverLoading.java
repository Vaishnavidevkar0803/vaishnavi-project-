package polymorphism;

public class MethodOverLoading {

	public static void main(String[] args)
	{
		MethodOverLoading m=new MethodOverLoading();
		m.display(20, 20);
		m.display(10, 20, 30);
	}

	public void display( int a,int b) 
	{
		int sum=a+b;
		System.out.println("sum of the 2 numbs are "+sum);
	}
	public void display( int a,int b,int c) 
	{
		int sum=a+b+c;
		System.out.println("sum of the 3 numbers are "+sum);
	}
}
