package callByReference;

public class CallByRefernce {

	public static void main(String[] args) 
	{
		CallByRefernce c=new CallByRefernce();
		c.name="BMW";
		c.mileage=40.9f;
		c.cost=34;
		
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		
		CallByRefernce b;
		b=c;
		
		System.out.println(b.name);
		System.out.println(b.mileage);
		System.out.println(b.cost);
		
		b.name="Mercedes";
		b.mileage=50.98f;
		b.cost=98;
		
		System.out.println(b.name);
		System.out.println(b.mileage);
		System.out.println(b.cost);
		
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		
		//changes made by c will affact b and changes made by c will affact the b
	}

	String name;
	float  mileage;
	int cost;	
}	


