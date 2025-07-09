abstract class A
{
	public abstract void m1();
	
}
abstract class B
{
	public abstract void m2();
}

class C extends A,B
{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
}


class Main
{
	public static void main(String[] args)
	{
		C c=new C();
		c.m1();c.m2();
	}
}