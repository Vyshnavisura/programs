class Main
{
	public static void main(String args[])
 	{
  		Student student =new Student(446,'A',70,10000,"Vyshnavi","vyshu3119@gmail.com","ECE");
  		student.studentDetails();
 		Employee emp =new Employee(03,"Developer",8,"female","Krishika","krishika2023@gmail.com","Developer");
		emp.employeeDetails();
	}
}
class Person
{
 	String name;
	String email;
 	String role;
 	Person(String name , String email, String role)
 	{
 		this.name =name;
  		this.email=email;
  		this.role=role;
	}
 	/*void personDetails()
 	{
  		System.out.println("Person name is :"+name);
  		System.out.println("Person email is :"+email);
  		System.out.println("Person role is :"+role);
	}*/
}
class Student extends Person
{
 	int roll;
 	char section;
 	double percentage;
 	int fee;
 	Student(int roll,char section,double percentage,int fee,String name , String email, String role)
 	{ 
		super(name,email,role);
  		this.roll=roll;
  		this.section=section;
  		this.percentage=percentage;
  		this.fee=fee;

 	}
 	void studentDetails()
 	{
		System.out.println("Person name is :"+name);
  		System.out.println("Person email is :"+email);
  		System.out.println("Person role is :"+role);
  		System.out.println("Student roll is :"+roll);
  		System.out.println("Student section is :"+section);
  		System.out.println("Student percentage is :"+percentage);
  		System.out.println("student fee is :"+fee);
	}
}
class Employee extends Person
{
 	int id;
 	String dept;
 	long salary;
 	String gender;
 	Employee(int id,String dept,long salary ,String gender,String name , String email, String role)
 	{
  		super(name,email,role);
  		this.id=id;
  		this.dept=dept;
  		this.salary=salary;
  		this.gender=gender;
	 }
 	void employeeDetails()
 	{
		System.out.println("Person name is :"+name);
  		System.out.println("Person email is :"+email);
  		System.out.println("Person role is :"+role);
  		System.out.println("employee id is :"+id);
  		System.out.println("employee dept is :"+dept);
  		System.out.println("employee salary is :"+salary);
  		System.out.println("employee  gender is :"+gender);
	}
}