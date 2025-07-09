/*class Main
{
	public static void main(String[] args)
	{
		Child2 c2=new Child2();
		c2.Parent();c2.Child1();c2.Child2();
	}
}
class Parent
{
	public void Parent()
	{
		System.out.println("in parent constructor");
	}
}
class Child1 extends Parent
{
	public void Child1()
	{
		System.out.println("in child1 constructor");
	}
}
class Child2 extends Child1
{
	public void Child2()
	{
		System.out.println("in child2 constructor");
	}
}*/


class MultiLevelInheritence
{
	public static void main(String args[])
  	{
    		Parent p = new Parent("Hyderabad", "Engineer", 123456789012L, 101, "IT", 50000L, "Female", "Vyshnavi", "vyshu@example.com", "Developer");
        	p.personDetails();
        	p.employeeDetails();
        	p.parentDetails();
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
  	void personDetails()
  	{
    		System.out.println("Person name is :"+name);
    		System.out.println("Person email is :"+email);
    		System.out.println("Person role is :"+role);
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
    		super(name ,email,role);
    		this.id=id;
    		this.dept=dept;
    		this.salary=salary;
    		this.gender=gender;
	}
  	void employeeDetails()
  	{
    		System.out.println("employee id is :"+id);
    		System.out.println("employee dept is :"+dept);
    		System.out.println("employee salary is :"+salary);
    		System.out.println("employee  gender is :"+gender);
	}
}
class Parent extends Employee
{
  	String location;
  	String occupation;
  	long aadhar;
  
  	Parent(String location,String Occupation,long aadhar,int id,String dept,long salary ,String gender,String name , String email, String role)
  	{  
		super(id,dept,salary ,gender,name ,email,role);
    		this.location = location;
        	this.occupation = occupation;
        	this.aadhar = aadhar;
    	}

    	void parentDetails() 
	{
        	System.out.println("Parent location is: " + location);
        	System.out.println("Parent occupation is: " + occupation);
        	System.out.println("Parent aadhar is: " + aadhar);
    }
}