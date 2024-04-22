package polymorphism;
//poly -->many
//morphism-->forms 
public class Over_Loading {
	
   public static void main(String[] args) 
   {
	   Over_Loading ov=new Over_Loading();
	   ov.sub(10, 8);
	   ov.sub(100, 50, 20);
	
}


	public void sub (int a,int b,int c)
	{   int sub=a-b-c;
		System.out.println("substraction is "+sub);
	}
	public void sub (int a,int b)//same method name but different parameters passed 
	{    int sub=a-b;
		System.out.println("substraction is "+sub);
	}
	
	//Declaring multiple methods with same method name but with different argument 
	//in a same class is called method overloading.

	

	

}
