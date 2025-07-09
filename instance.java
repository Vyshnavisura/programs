class Main
{
	public static void main(String[] args)
	{
		Child ch=new Child(10,"vyshu");
		System.out.println(ch.printParent());	
	}
}

class Child extends Parent
{
	
	Child(int id,String name)
	{
		super.id=id;
		super.name=name;
		System.out.println("i am child");
	}
}

class Parent
{
	int id;
	String name;
	Parent()
	{
		this.id=id;
		this.name=name;	
	}
	String printParent()
	{
		return id+" "+name;
	}
}