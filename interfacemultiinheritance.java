interface A
{
	public void m1();
}

interface B
{
	public void m2();
}

class C implements A,B
{
	public void m1()
	{
		System.out.println("A");
	}
	public void m2()
	{
		System.out.println("B");
	}
}

class Main
{
	public static void main(String[] args)
	{
		C c=new C();
		c.m1();
		c.m2();
	}
}