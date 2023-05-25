import java.util.Scanner;
//demo program on abstraction
//Many interfaces can be implemented by single abstract class
//only one concreate class or abstract class can be extended by abstract 
//class
interface Service11
{
	void startService();
}
interface IdProvider
{
	int[] customerIds= {101,108,106,104,112};
}

 abstract class Login1
{
	abstract boolean getLogin(int id);
}
abstract class Rbi extends Login1 implements IdProvider, Service11
{
	double amount=5000.00;
	public Rbi(String msg)
	{
		System.out.println("Welcome to" + " "+msg );
		
	}
	//customer
	public double deposit(double amt)
	{
		amount=amount+amt;
		return amount;
	}
	//not customer 
	//The abstract method getBanking in 
	//type Rbi can only be defined by an abstract class
  public abstract boolean getBanking(Rbi rbi); 
	
}
//implicit super constructor Rbi() is undefined for default constructor.
//Must define an explicit constructor
//the type SBI must implement the inherited abstract method Rbi.
//getBanking(Rbi)
class SBI extends Rbi
{

	public SBI(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getBanking(Rbi rbi) {
		//instanceof operator is used to check whether the reference is 
		//type
		//of the particular class type or not
		 if(rbi instanceof SBI)
		 {
			 return true;
		 }
		return false;
	}

	@Override
	boolean getLogin(int id) {
		for(int i=0; i<IdProvider.customerIds.length; i++)
		{
			if(IdProvider.customerIds[i]==id)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public void startService() {
		// TODO Auto-generated method stub
		
	}
	
}
/*class HDFC extends Rbi
{

	public HDFC(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getBanking(Rbi rbi) {
		//instanceof operator is used to check whether the refence is 
		//type
		//of the particular class type or not
		 if(rbi instanceof HDFC)
		 {
			 return true;
		 }
		return false;
	}
	
}*/












public class TestAbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cannot instantiate the type Rbi
  Rbi rbi;
  rbi=new SBI("SBI Bank");
boolean result1=  rbi.getBanking(rbi);
if(result1)
{
	System.out.println("SBI is valid bank ");
}else
{
	System.out.println("SBI is not valid bank");
}
System.out.println("Enter amount to deposit");
Scanner scanner=new Scanner(System.in);
	double amt=scanner.nextDouble();
	  double finalAmt= rbi.deposit(amt);
		System.out.println("after deposit your balance is"+ " "+finalAmt);
	
	
	boolean status=	rbi.getLogin(1554);
		if(status)
		{
			System.out.println("Login success");
		}
		else
		{
			System.out.println("Login failed");
		}
		
		
	
		
	}

}
