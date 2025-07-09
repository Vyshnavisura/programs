class Main
{
	public static void main(String[] args)
	{
		Student student=new Student();
		char b='G';
		student.m1(b);
	}
	
}

//byte==>short==>char==>int==>long==>float==>double


/*class Student
{//same method with passing different parameters
	void m1()
	{
		System.out.println("d");
	}
	void m1(int a)
	{
		System.out.println(a);
	}
	void m1(int a,int b)
	{
		System.out.println(a" "+b);
	}
}*/

class Student
{//implicit and explicit type casting
	void m1(int x)
	{
		System.out.println("int "+x);
	}
	/*void m1(double x)
	{
		System.out.println("double");
	}*/
}


























