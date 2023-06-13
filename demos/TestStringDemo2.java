package string.demos;

import java.util.Arrays;

public class TestStringDemo2 {

	public static void main(String[] args) {
 
		String str="welcome to IBM";
		//incase of charAt(int) --if we will pass any index which not available in given
		//string then, we will get runtime error "StringIndexOutofBoundException"
		 
		int strLength=str.length();
		   System.out.println(strLength);
		 char ch= str.charAt(str.length()-1);
		System.out.println(ch);
		 char[] ch1=str.toCharArray();
		System.out.println(Arrays.toString(ch1));
		  byte[] b=str.getBytes();
		  System.out.println(Arrays.toString(b));
		   int indexOfE= str.indexOf('e');
		  int k=   str.indexOf("IBM");
		System.out.println(indexOfE);
		  System.out.println(k);
		


	}

}
