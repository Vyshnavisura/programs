class Main
{
	public static void main(String[] args)
	{
		Parent parent=new Parent(1,"vyshnavi","female","vyshu3119@gmail.com","IT","devops",30000.40,"hyderabad","business",12345678);
		parent.printParentDetails();
	}
}

class Person
{
	String name;
	String email;
	String role;
	Person(String name,String email,String role)
	{
		this.name=name;
		this.email=email;
		this.role=role;
	}
}

class Employee extends Person
{
	int id;
	String dept;
	double salary;
	String gender;
	Employee(int id,String name,String gender,String email,String dept,String role,double salary)
	{
		super(name,email,role);
		this.id=id;
		this.dept=dept;
		this.salary=salary;
		this.gender=gender;
	}
}


class Parent extends Employee
{
	String location;
	String occupation;
	long aadhar;
	Parent(int id,String name,String gender,String email,String dept,String role,double salary,String location,String occupation,long aadhar)
	{
		super(id,name,gender,email,dept,role,salary);
		this.location=location;
		this.occupation=occupation;
		this.aadhar=aadhar;
	}
	void printParentDetails()
	{
		System.out.println("id : "+id+"\n"+"Name : "+name+"\n"+"Gender : "+gender+"\n"+"Email : "+email+"\n"+"Department : "+dept+"\n"+"Role : "+role+"\n"+"Salary : "+salary+"\n"+"Location : "+location+"\n"+"Occupation : "+occupation+"\n"+"Aadhar : "+aadhar);
	}
	
}





