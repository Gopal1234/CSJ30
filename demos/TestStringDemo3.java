package string.demos;

import java.util.Scanner;

public class TestStringDemo3 {

	public static void main(String[] args) {

  String[] unames= {"cap123","abc","xyz","sasa"};
  
  Scanner scanner =new Scanner(System.in);
  System.out.println("Enter user name");
  String un=scanner.nextLine();
  for(String name:unames)
  {
	  //boolean equals(String str)
	  if(name.equalsIgnoreCase(un))
	  {
		  
		  System.out.println("Enter your phone");
		  //8147117572
		  //10-4=6
		  String phoneNumber=scanner.nextLine();
		  int len=phoneNumber.length();
		  //String subString(int fromIndex)
		  //10-4 =6
		     String lastFourDigit=phoneNumber.substring(len-4);
		     //String subString(int from. int to)
		     String nameSubString=name.substring(1,3);
		     //String concat(String str)
		     String pwd=lastFourDigit.concat(nameSubString);
		     System.out.println("congratulations !!! "
		     		+ "your password is"+ " "+pwd);
		     break;
	  }
	  
	  
  }
  
  
  
		
		
		
		
		
		
		

	}

}
