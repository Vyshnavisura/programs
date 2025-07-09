class Main
{
	public static void main(String[] args)
	{
		Child child=new Child();
		child.m1();child.m2();child.m3();child.m4();
	}
}
class Parent
{
	void m1()
	{
		System.out.println("parent1");
	}
	void m2()
	{
		System.out.println("parent2");
	}
	void m3()
	{
		System.out.println("parent3");
	}
	void m4()
	{
		System.out.println("parent4");
	}
	
}

class Child extends Parent
{
	void m1()
	{
		System.out.println("child1");
	}
	void m4()
	{
		System.out.println("child4");
	}
}