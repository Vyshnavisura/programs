class Main
{
	public static void main(String[] args)
	{
		Student student = new Student(11,"krish",34567);
		System.out.println(student.printStudent());
		Student student1=new Student(446,"vyshnavi",234556);	
		System.out.println(student1.printStudent());
	}
}

class Student
{
	int id;
	String name;
	int salary;
	Student(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	String printStudent()
	{
		return id+" "+name+" "+salary;
	}	
}