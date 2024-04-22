package interface_use;

public interface Mother  
{
	 default void looks()
	 {
		 System.out.println("incredible looks");
	 }
	 static void cooking_skiils()
	 {
		 System.out.println("yumm");
	 }
	default void love()
	{
		System.out.println("mothers love");
	}
	void kind();

}
