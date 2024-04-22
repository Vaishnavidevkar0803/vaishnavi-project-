package loops;

public class Do_WhileLoop {

	public static void main(String[] args) {

		//if the no.of iteration is not fixed and still u must have to excute the loop at least once
		//do while is recommented
		int i=4;//initialization
		do
		{
			System.out.println(i);//4
			i=i+4;//updation      //8
		}
		while 
			(i==70);//do while statements will be excutes once even if the condition is false
	}
	//condition fails as 4 is not equal to the 70 so it gets out of the loop but in do loop as there is 
	//printing statment it will print at least 1 value 
	//as the condition gets checked in outside of the loop

}
