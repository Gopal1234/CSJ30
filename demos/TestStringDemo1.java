package string.demos;
//program to demonstrate that only one time string objects is created and same reference
//refer by multiple string references
public class TestStringDemo1 {

	public static void main(String[] args) {
//creating string literal
		String name1="XYZ";//102
		String name2="XYZ";//102
		String name3="XYZ";
		System.out.println(name1.hashCode()+ " "+name2.hashCode() 
		+ " "+name3.hashCode());
		if(name1==name2)
		{
			System.out.println("both address are same");
			
		}else
		{
			System.out.println("address are not same");
		}

		
		
		
		

	}

}
