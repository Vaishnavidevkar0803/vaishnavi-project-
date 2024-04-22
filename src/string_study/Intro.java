package string_study;

public class Intro 
{
//	Java StringBuffer class is used to create mutable (modifiable) String objects. 
//The StringBuffer class in Java is the same as String class except it is mutable 
//i.e. it can be changed.
//Java StringBuffer class is thread-safe i.e. multiple threads cannot access it
//simultaneously.So it is safe and will result in an order.
	
	
//	What is a mutable String?
//	A String that can be modified or changed is known as mutable String.
//StringBuffer and StringBuilder classes are used for creating mutable strings.
	
//	Java StringBuilder Class
//	Java StringBuilder class is used to create mutable (modifiable) String. 
//The Java StringBuilder class is same as StringBuffer class except that it is 
//non-synchronized. It is available since JDK 1.5.
	
//=====================diff betn String & String buffer======================
	
	     
//	String 
//	1) String class is immutable. 
//
//	2) String is slow and consumes more memory when you
//	concat too many strings because every time it creates
//	new instance.
//	
//	3) String class overrides the equals() method of Object
//	class. So you can compare the contents of two strings
//	by equals() method.
//
//	StringBuffer
//	1)StringBuffer class is mutable
//
//	2)StringBuffer is fast and consumes
//	less memory when you cancat strings
//
//	3)StringBuffer class doesn't override
//	the equals() method of Object class.
}
