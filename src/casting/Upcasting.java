package casting;

public class Upcasting {

	public static void main(String[] args) 
	{
		Humans h=new Humans();
		h.pollution();
		h.sun();
		h.plants();
		
		System.out.println("----------UPcasting Methods-------------");
		Nature n=new Humans();//creating object of subclass & giving the refernce of superclass
		n.sun();//eligible for casting 
		n.plants();//eligible for casting 
		//n.pollution();-->not eligible for casting as its not common/ superclass method

		
	

	}

}
