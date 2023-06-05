package pack1;

import model.Customer;

public class BankCustomer {
	/*
	 * Access specifier are the 
	 * keyword which controls the visibility of attributes or 
	 * fields or methods or constructor to access from the other classes or interfaces
	 * 
	 * four access specifier
	 * i.public
	 * ii.private
	 * iii.protected
	 * iv.<no-keyword> considered as default
	 * 
	 * 
	 */
	public String customerName="Ravi";
	private int pinCode=1234;
	protected long customerAccount=232424242L;
	 String bankName="SBI bank";
	 
	 public int getPinCode()
	 {
		 return pinCode;
	 }
	

}//close BankCustomer
class TestBank1
{
	public  void display()
	{
		BankCustomer bank=new BankCustomer();
		//The field BankCustomer.pinCode is not visible
		System.out.println(bank.customerName + " "+bank.getPinCode() + " "+bank.customerAccount+ " "+bank.bankName);
		
	}
	
	
}

class A extends BankCustomer
{
	public void displayDetails()
	{
		BankCustomer bank=new BankCustomer();
		//The field BankCustomer.pinCode is not visible
		System.out.println(bank.customerName + " "+bank.pinCode + " "+bank.customerAccount+ " "+bank.bankName);
		
	}
	
	
}