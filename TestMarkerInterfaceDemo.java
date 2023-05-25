
interface MyInterface
{
	
}

class A11 implements MyInterface
{
	
	public void showPolicy(A11 a)
	{
		if(a instanceof MyInterface)
		{
			System.out.println("you can see policy");
		}else
		{
			System.out.println("not available for you");
		}
	}
	
}


public class TestMarkerInterfaceDemo {

	public static void main(String[] args) {
	
		A11 aObj=new A11();
		aObj.showPolicy(aObj);

	}

}
