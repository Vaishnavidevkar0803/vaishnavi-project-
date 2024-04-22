package logical_Programs;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
	  int num=153;
	  int sum=0;//0,27,125,152
	  //153=(1*1*1)+(5*5*5)+(3*3*3)=153
	  
	  for(int i=num;i>0;i=i/10)//153/10=15.3 -->15/10=1.5 -->1/10=0.1
	  {
		 int remainder = i%10;//3,5,1
		 //modulo operator. It returns the remainder of a division operation. 
		 //For example, 10 % 3 would return 1, because 10 divided by 3 is 3 with a 
		 //remainder of 1.
		 sum=sum+(remainder*remainder*remainder);//27+0=27
		 //125+27=152 
		 //152+1=153
	  }
	  System.out.println(num);//153
	  System.out.println(sum);//153
	  
	  if(num==sum)
	  {
		  System.out.println("given num is armstrong number");
	  }
	  else
	  {
		  System.out.println("given num is not a armstrong number");
	  }
	  
	  
	  
	}

}
