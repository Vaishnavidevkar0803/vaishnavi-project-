package logical_Programs;


public class FindDuplicateNumbers {

	public static void main(String[] args) 
	{
      int ar[]= {1,2,3,6,4,2,5,0,3,6,7,9,8,9,0};
      System.out.println("duplicate elements are");
      
      for(int i=0;i<ar.length;i++)
      {
    	  for(int j=i+1;j<ar.length;j++)
    	  {
    		  if(ar[i]==ar[j])
    		  {
    			  System.out.print(ar[j]+" ");
    		  }
    	  }
      }
	}

}
