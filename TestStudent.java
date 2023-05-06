import java.util.Scanner;

//demo program for array of object or non primitive array 
class Student
{
	int rollNo;
	String name;
	int marks;
	String course="Java";
	public Student(int rollNo, String name, int marks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		//this.course = course;
	}
	String displayDetails()
	{
		return rollNo+ " "+name + " "+marks+ " "+course;
	}
	
	}
class StudentService
{
	//declaring array varaible 
	Student[] studentObjects;
	//decalring index variable as i which starts from 0
	int i=0;
	//defing a method called setContainerSize(int size)
	//this method will take integer size as parameter
	//based on that size it will create one array object
	//initialize that array object in above declared reference variable
	
	public void setContainerSize(int size)
	{
		studentObjects=new Student[size];
	}
	/*
	 * The method addStudent(Student studentObject)
	 * This method will take student object as input parameter
	 * That object will be initialized into array object of Student type
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	public void addStudent(Student student)
	{
		
		//  right side of equal operator , I am initializing student obejct
		//left side of = operator I am inserting the student object into student array from index 0 to n
		
			studentObjects[i++]=student;
	
		
	}
	//getStudent() returns Student[] as return type
	//It will return same student array which we added using addStudent()
Student[]	getStudent()
{
	return studentObjects;
}
//This m
public Student getStudentDetailsByRollNo(int rollNo)	
	
{
	return null;
}
	
	
}

public class TestStudent {

	public static void main(String[] args) {
		//creating array of student object and initializing the object og student
		
		/*Student[] studentObjecs= {new Student(1,"A",58,"Java"),
				new Student(2,"B",98,"Angular")};*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of students");
		int nos=scanner.nextInt();
		//here declaring reference of Student 
		Student student;
		//here we are creating the object of StudentService
		//because we have to access all non-static methods of StudentService
		
		StudentService service=new StudentService();
		//calling setContainerSize(int size) method by passing size from user
		
		service.setContainerSize(nos);
		//creating loop to take multilple input to create multiple of object student
		//in this loop block we are calling addStudent(Student student) method
		
		for(int i=0; i<nos; i++)
		{
			System.out.println("enter roll no");
			int rno=scanner.nextInt();
			System.out.println("Enter name");
			String name=scanner.next();
			System.out.println("Enter marks");
			int marks=scanner.nextInt();
			/*System.out.println("Enter course");
			String course=scanner.next();*/
		student=new Student(rno,name,marks);
			service.addStudent(student);
			
		}
		
		//calling getStudent() method
		//which returns the array of student object
		  Student[] fetchStudent= service.getStudent();
		  //iterating using for-each loop
		  /*
		   * Syntax: datasource can be array, collection, map, stream
		   * for(Variable v:datasource)
		   * {
		   * 
		   * }
		   * 
		   * 
		   */
		  for(Student s:fetchStudent)
		  {
			  System.out.println(s.displayDetails());
		  }
		//iterating array of student
		/*for(int i=0; i<studentObjects.length; i++)
		{
			System.out.println(studentObjects[i].displayDetails());
		}*/
		
		
		
		
		
		
		
		
 /*String detail1=  studentObjecs[0].displayDetails();
 System.out.println(detail1);*/
		//System.out.println(studentObjecs[0].displayDetails());
 /*String detail2=  studentObjecs[1].displayDetails();
 System.out.println(detail2);*/
 
 //System.out.println(studentObjecs[1].displayDetails());
	}

}
