package string_study;

public class StringTheory {

	public static void main(String[] args) 
	{
		//String is a collection of characters 
		//memory size of string is not fixed
		//string class final in natrue....why? so that noone can override the methods from string class
		//it is a non primitive type of data
		//it is inbuilt class in java.lang package
		//string is immutable in natrue 
		//object creation in string can be done in 2 ways with using new keyword & without using new keyword
		//object going get placed inside the string pool area which comes uder the heap area 
		//if obejct creation takes place without using new keyword then the it takes place inside the 
		//constatnt pool area 
		//with using new keyword -->non constant pool area 
		//in a constant pool area --> if the 2 differnt variables have the value then what java does is 
		//it simply create only 1 meomry space inside the constatnt pool area & refer 2variables 
		//and simpy save the space 
		//but in non constatnt pool area for every variable it creates different memory space 
		
		String s="vaishnavi";
		String v="Vaishnavi";
		String v2="Vaishnavi";
		System.out.println(s.equals(v));//it is a case sensitive method checks the case -->false
		System.out.println(s==v);//-->false
		System.out.println(v==v2);//-->true it creates the same memory space called "Vaishnavi"
		//refering 2 variables towards it (v & v2)-->constatnt pool area
		
		
		String s1=new String("Vaishnavi");
		String v1=new String("Vaishnavi");
		System.out.println(s1.equals(v));//case sensitive -->true
		System.out.println(s1==v1);//not a case senstive it checks the memory allocation-->false
		//in non constant pool area every variable has a seprate memory space

	}

}
