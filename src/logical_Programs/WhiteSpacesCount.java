package logical_Programs;

public class WhiteSpacesCount {

	public static void main(String[] args)
	{
	String name="v ais  hnn av i";
	int counter=0;
	
	for(int i=0;i<=name.length()-1;i++)
	{
		char ch = name.charAt(i);//Returns the char value at the specified index
		if(ch==' ')
		{
			counter++;
		}
	}
	System.out.println("the count of white spaces in the string are "+counter);
	
	System.out.println("==========================");
	
	String s="Pun e ";
	int counter2=0;
	for(int i=0;i<=s.length()-1;i++)
	{
	char ch = s.charAt(i);//0,1,2,3,4,5,6
	if(ch==' ')
	{
	counter2++;//0,1,2,3
	}
	}
	System.out.println("Number of white spaces are "+counter2);
	}

}
