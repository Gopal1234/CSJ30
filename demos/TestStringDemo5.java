package string.demos;

import java.util.Scanner;
//demo  program using matches method
public class TestStringDemo5 {
	
	/*public boolean validatePANNumber(String panNumber)
	{
		//ADKTX1234TW
	}*/
	
	
	
	
	public static boolean validateEmailId(String emailId)
	{
		/*
		 * upadHyay076@gmail.com
		 * upadhyay087@cybersuccess.com
		 * criteria: in my email id any alphabet
		 * (lower case or upper case)
		 * ,any digit, any special character like(@#_) can contain
		 * zero or more
		 * 
		 * in my mail id "@" character should be there only 1 time
		 * then any alphabet from a-z or A-Z should 
		 * be there one or more times
		 * 
		 * in my mail id .should be there
		 * after that it should contain three alphabets like COM or com
		 * 
		 * 
		 * 
		 */
		
		
		
		
		String exforEmail=
				"[a-zA-z0-9#_]+[@]{1}[a-zA-z]+[.]{1}[comCOM]{3}";
	
		if(emailId.matches(exforEmail))
		{
return true;
		}
		return false;
	
	
	}
	
	
	
	
	

	public static void main(String[] args) {

  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter your phone number");
  String ph=scanner.nextLine();// 8147117572
  //validation phone number format is corrcet or not
  //email id format is corrcet or not
  
  //I want to validate my phone number
  //criteria: phone number should start with either 7 or 8 or 9 and 
  //that can follow with any digit from
  //0-9 for 9 times
  //"[789]"
  String expressionForPhoneNumber="[789]{1}[0-9]{9}";
 
boolean status=  ph.matches(expressionForPhoneNumber);
  if(status)
  {
	  System.out.println("Valid phone number");
  }else
  {
	  System.out.println("Invalid phone number");
  }
  
   if(validateEmailId("upaDHyay#076@wipro.CoM"))
   {
	   System.out.println("valid email");
   }
   else
   {
	   System.out.println("not  valid email");
   }
  
  
		
		
		
		
		
		
	}

}
