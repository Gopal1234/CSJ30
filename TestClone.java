package pack3;

import java.util.Objects;

class Account{
	int accuntId;
	String accountType;
	
	
	
	public Account(int accuntId, String accountType) {
		super();
		this.accuntId = accuntId;
		this.accountType = accountType;
	}



	



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountType, other.accountType) &&
				accuntId == other.accuntId;
	}



	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account ac1=new Account(1, "SAVINGS");
		System.out.println(ac1.accuntId + " "+ac1.accountType);
		Account ac2=(Account)ac1.clone();
		System.out.println(ac2.accuntId +" "+ac2.accountType);
		
		boolean b1= ac1.equals(ac2);
		System.out.println(b1);
Account ac3=new Account(2, "CURRENT");
   boolean b2=ac1.equals(ac3);
	System.out.println(b2);	
		
		
	}

}
