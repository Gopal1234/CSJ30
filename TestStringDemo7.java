package string.demos;

public class TestStringDemo7 {
	public static void main(String[] abc)
	{
		
		/*
		 * What is StringBuffer
		 * 
		 * StringBuffer is class
		 * This class provides the way to create mutable string objects
		 * StringBuffer maintain one buffer memory and the default capacity is 16
		 * 
		 * StringBuffer provides three constrcutors:
		 * 1.StringBuffer()
		 * 2.StringBuffer(String input)
		 * 3.StringBuffer(int capacity)
		 * 
		 * by default all string buffer methods are thread safe or synchronized
		 * 
		 * in case of string buffer once the capacity elapsed then new buffer capacity
		 * will be reset using following given formula
		 * 
		 * (oldcapacity*2)+2
		 * 
		 * 16*2+2
		 * 34
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		//How to create StringBuffer object
		
		
		String str="Hello";
		
		  str.replace('H', 'y');
		  System.out.println(str);
		StringBuffer sb=new StringBuffer(str);
		sb.append(" ");
		sb.append("Hi");
		sb.append(" ");
		sb.append("Thanks");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		
		
		
		
		
		
	}
	
	
	
	

}
