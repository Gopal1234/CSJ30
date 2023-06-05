package pack1;

class A1
{
	
	public void showWelcomeMsg()
	{
		System.out.println("Welcome to our website");
	}
	public void display()
	{
		System.out.println("displaying customer details..");
	}
}
class A2 extends A1
{
	public void display()
	{
		System.out.println("displaying customer details with Order..");
	}
	public void showGreetingMsg()
	{
		System.out.println("Good morning");
	}
	
	
}

public class TestUpCastingDownCasting {
public static void main(String[] args) {
	/*
	 * Implementing upcasting
	 * upcasting means child object intiliazed into parent reference
	 * in this case we can invoke non-overidden parent class methods
	 * 
	 * 
	 * 
	 */
	A1 parent=new A2();
	parent.showWelcomeMsg();
	parent.display();
	
	/*
	 * incase of downcasting we can initialize the reference of parent type into the
	 * the reference child type
	 * 
	 * using downcasting we access all non-overriden method of 
	 *   parent type and child type
	 * 
	 * 
	 * 
	 */
	A2 child=(A2)parent;
	
	//child.showWelcomeMsg();
	//child.display();
	child.showGreetingMsg();
}
}
