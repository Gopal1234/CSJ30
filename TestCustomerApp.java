import java.util.Scanner;
class Customer
{
int customerId;
String customerName;
String customerEmail;
String customerAddress;
long phoneNumber;
Customer(int customerId, String customerName, String customerEmail, String address, long ph)
{

this.customerId=customerId;
this.customerName=customerName;
this.customerEmail=customerEmail;
customerAddress=address;
phoneNumber=ph;
}
  int getId()
{
return customerId;

}
 String getName()
{
return customerName;

}

 String getEmail()
{
return customerEmail;

}

 String getAddress()
{
return customerAddress;

}
 long getPhone()
{
return phoneNumber;

}
}




class CustomerService
{
/*It is reference variable of Customer(class) type
The expected value in this reference variable is the object of customer class
just like 
int a

the expected value of a is 10 or 100 that means any valid integer value

The same way Customer is a type and customer is a refernrence varaible */ 




Customer customer;

/*
This method takes customer object as input , that's why we passed Customer type of reference variable as parameter,
this varaible can able to hold the object of customer class in it's parameter

The return type of this method is void

the access specifier of this method is public , so that it can be accessable inside  any class


this method initializing the paramterized customer object into an instance variable of Customer type, which can be accessable from any method inside this class block

*/
public void addCustomer(Customer customer)
{
this.customer=customer;

}

/*
This method name is getCustomer()

return type is Customer type that means it return the value of Customer type that is nothing but the object of customer class

just consider 
if a method is,

 int getId()
  {
return 100;
}
so here int is type just like Customer
and value is 100 , but for customer value is valid object of customer(new Customer());
   
method is using public access specifier

once this method will be called we can get the currently running object of the customer class

*/

public Customer getCustomer()

{
return customer;
}
/*

this method is updateCustomer(long phNumber, String address, int customerId), which takes three inputs like
phone number which is updatable, address is updatable and existing customerId with the currently running object of customer

this method checks whether customerId existing or not, if yes then it is going to set the properties of phoneNumber with new Phone numbe which we passed in parameter of this method

the same way it is updating for address

finaly it returns that object

otherwise it returns null(default value of object) */



public Customer updateCustomer(long phNumber, String address, int customerId)
{
if(this.customer.getId()==customerId)
{
this.customer. phoneNumber=phNumber;
this.customer.customerAddress=address;
return this.customer;

}
return null;

}
}
public class TestCustomerApp
{

public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter id");
int id=s.nextInt();

System.out.println("Enter name");
String name=s.next();
System.out.println("Enter address");
String address=s.next();
System.out.println("Enter email");
String mailId=s.next();
System.out.println("Enter phone");
long ph=s.nextLong();

//creating object and initializing properties
Customer customerObj=new Customer(id,name,mailId, address, ph);
//creating object of service class to access all service method
CustomerService service=new CustomerService();
 //call addCustomer method with the object of customer(this technique known as //call by reference)

service.addCustomer(customerObj);


//calling getCustomer() method

Customer custObj=service.getCustomer();
int id1=custObj.getId();
String n1=custObj.getName();
String e1=custObj.getEmail();
String add1=custObj.getAddress();
long p1=custObj.getPhone();
System.out.println(id1 + " "+n1+ " "+e1+ " "+add1+ " "+p1);




//calling updateCustomer(long phNumber, String address, int customerId)

Customer updatedCustomer=  service.updateCustomer(12346L, "PUNE", 123);
int id2=updatedCustomer.getId();
String n=updatedCustomer.getName();
String e=updatedCustomer.getEmail();
String add=updatedCustomer.getAddress();
long p=updatedCustomer.getPhone();
System.out.println(id2 + " "+n+ " "+e+ " "+add+ " "+p);


}



}