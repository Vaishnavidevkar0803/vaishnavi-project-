package logical_Programs;

public class Duplicate_characters {

	public static void main(String[] args)
	{
    char letters[]= {'a','b','a','c','v','j','s','v'};//0,1,2,3,4,5
    System.out.println("duplicate elements are as follows :");
    
    for(int i=0;i<letters.length;i++)
    {
    	for(int j=i+1;j<letters.length;j++)
    	{
    		if(letters[i]==letters[j])
    		{
    			System.out.print(letters[j]+" ");
    		}
    	}
    }//When going to traverse through an Array; total number of elements is the length[no round bracket]
    //When traversing through a String we go by index system so length()-1;
	}

	//a-->b,a,c,v,j,s,v-->a
	//b-->a,c,v,j,s,v-->null
	//a-->c,v,j,s,v-->null
	//c-->v,j,s,v-->null
	//v-->j,s,v-->v
	//j-->s,v-->null
	//s-->v-->null
}
