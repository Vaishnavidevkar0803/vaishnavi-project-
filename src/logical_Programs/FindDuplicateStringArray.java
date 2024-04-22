package logical_Programs;

public class FindDuplicateStringArray {

	public static void main(String[] args) 
	{
		String name[]= {"vaish","sahil","sonali","apurva","ady","sahil","ady","vaish"};
		System.out.println("duplicate elements are as follows :");
		
		for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i]==name[j])
				{
					System.out.print(name[j]+" ");
				}
				
			}
		}
	}

}
