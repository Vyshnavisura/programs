class Main
{
	public static void main(String[] args)
	{
		Child1 c1=new Child1();
		c1.m1();
		c1.m2();
		Child2 c2=new Child2();
		c2.m1();
		c2.m3();
	}
}

class Parent
{
	void m1()
	{
		System.out.println("i'm in parent");
	}
}
class Child1 extends Parent
{
	void m2()
	{
		System.out.println("i'm in child1");
	}
}
class Child2 extends Parent
{
	void m3()
	{
		System.out.println("i'm in child2");
	}
}
