package logical_Programs;

public class FibonaciSeries {

	public static void main(String[] args) 
	{
//0 1 1 2 3 5 8 13 22
		//addition of 2 numbers is next number 
		int num=10;
		
		int num1=0;
		int num2=1;
		
		for(int i=0;i<num;i++)
		{
			int sum = num1+num2;//swapping 1=0+1
			num1=num2;//num1=1
			num2=sum;//num2=1
			System.out.print(num1+" ");//1,1,2
			
			
		}
	}

}
