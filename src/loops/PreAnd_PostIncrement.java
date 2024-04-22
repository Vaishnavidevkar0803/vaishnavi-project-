package loops;

public class PreAnd_PostIncrement {

	public static void main(String[] args) {
	
		int a=10;
		System.out.println(a);//10
		
		int i;
		i=a++;//1st assign the value then increment
		{
			System.out.println(a);//11
			System.out.println(i);//10
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int b=12;
		System.out.println(b);
		int c;
		c=b++;//first assign the value then increment 
		{
			System.out.println(b);//13
			System.out.println(c);//12
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int z=10;
		System.out.println(z);//10
		int y=++z;//1st increment then assign
		{
			System.out.println(z);//11
			System.out.println(y);//11
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int x=20;
		System.out.println(x);//20
		int w=x--;//1st assign the value then decrement
		{
			System.out.println(w);//20
			System.out.println(x);//19
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int o=100;
		System.out.println(o);//100
		int j=--o;//1st decrement then assign
		{
			System.out.println(o);//99
			System.out.println(j);//99
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int v=30;
		System.out.println(v);//30
		int g;
		g=v++;
		System.out.println(v);//31
		System.out.println(g);//30
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int s=40;
		System.out.println(s);//40
		int r=++s;
		System.out.println(s);//41
		System.out.println(r);//41
	}
}
