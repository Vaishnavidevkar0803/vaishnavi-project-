package logical_Programs;

public class RemoveVowels {

	public static void main(String[] args) 
	{
	   String s="pranav";
	   String t="";
	   
	   for(int i=0;i<=s.length()-1;i++)
	   {
		   char c = s.charAt(i);//to traverse through the string (get each character)
		   if( c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')//compare characters 
			{
				continue;
			}
		   t=t+c;
	   }
	   System.out.println(s);
	   System.out.println(t);
	  
	
	
	}

}
