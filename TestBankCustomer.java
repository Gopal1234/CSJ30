package pack2;

import pack1.BankCustomer;

class RBI extends BankCustomer
{
	
	
	public void displayBakDetails()
	{
		RBI bank=new RBI();
		//The field BankCustomer.pinCode is not visible
		System.out.println(bank.customerName + " "+bank.getPinCode() + " "+bank.customerAccount+ " "+bank.bankName);
		
	}
}


public class TestBankCustomer {

}
