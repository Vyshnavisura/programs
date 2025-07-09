class Main
{
	public static void main(String[] args)
	{
		Student student=new Student();
		System.out.println(student.printStudent());

		Student student1=new Student("krish");
		System.out.println(student1.printStudent());
		
		Student student2=new Student("vysh",2);
		System.out.println(student2.printStudent());

		Student student3=new Student("john",3,20,30,40);
		System.out.println(student3.printStudent());
	
		student3.total();
		student3.per();
		
	}
}


class Student
{
	String name;
	int roll;
	int m1,m2,m3;
	double total,per;
	Student()
	{
		this.name="Vyshnavi";
		this.roll=446;
		this.m1=10;
	}
	Student(String name)
	{
		this.name=name;
	}
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	Student(String name,int roll,int m1,int m2,int m3)
	{
		this.name=name;
		this.roll=roll;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	void total()
	{
		total=m1+m2+m3;
		
	}
	void per()
	{
		per=(total/300)*100;
		
	}
	String printStudent()
	{
		return name+" "+roll+"\n"+m1+" "+m2+" "+m3+"\n"+total+per;
	}	
}