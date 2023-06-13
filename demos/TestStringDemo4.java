package string.demos;

public class TestStringDemo4 {

	public static void main(String[] args) {

		//demo for indexOf() and lastIndexOf()
/*String str="welcome";
 // str.indexOf(str.charAt(str.length()-1));
int pos2=str.indexOf('e');
int pos1=str.lastIndexOf('e');
		System.out.println(pos2 + " "+pos1);*/
	//[ABC]	" "//s
		//demo for  String[] split(Sting regex)
		/*String str2="Hi everyone welcome to our website.
		 *  How are you. I am fine";
		  // String[] tokens=str2.split("\\s");
		  String[] tokens=str2.split("\\.");
		  System.out.println(tokens.length);*/
		
		/*String str3="welcome to wipro";
//String s2=		 str3.replace('w', 't');
		String s4= str3.replace("wi", "**");
		System.out.println(s4);*/
		
		String str4="Gopal Upadhyay";
	String s1=	  str4.replaceAll("[AEIOUaeiou]", "");
		System.out.println(s1);
		
		
		String str5="upadhyay076@gmail.com";
		if( str5.contains("@") && str5.contains("."))
		 {
			 System.out.println("valid email");
		 }else
		 {
			 System.out.println("not valid email");
		 }
		
		  
		
		
		
		

	}

}
