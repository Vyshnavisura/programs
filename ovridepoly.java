/*Method overloading
class Main
{
	public static void main(String[] args)
	{
		Main main=new Main();
		main.m1(10);
			
	}
	public static void m1()
	{
		System.out.println("no args");
	}
	public static void m1(int x)
	{
		System.out.println("int"+ x);
	}
}*/

/*class Main
{
	public static void main(String[] args)
	{
		Sample sample=new Sample();
	} 
}

class Sample
{
	Sample()
	{
		System.out.println("no args");
	}
	Sample(int x)
	{
		System.out.println("int");
	}
}*/



/*overriding
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
}*/


class Main
{
	public static void main(String[] args)
	{
		Parent parent;
		parent=new Child();
		parent.m1();parent.m2();parent.m3();
	}
}

class Parent
{
	void m1()
	{
		System.out.println("parent m1");
	}
	void m2()
	{
		System.out.println("parent m2");
	}
	void m3()
	{
		System.out.println("parent m3");
	}
}

class Child extends Parent
{
	void m1()
	{
		System.out.println("child m1");
	}
	void m3()
	{
		System.out.println("child m3");
	}
}
























