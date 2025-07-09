class Main
{
	public static void main(String[] args)
	{
		Child ch=new Child();
		System.out.println(ch.printParent());	
	}
}

class Child extends Parent
{
	Child()
	{
		super("vys","asdf@asdf","aaa");
		System.out.println("i am child");
	}
}

class Parent
{
	String name;
	String email;
	String role;
	Parent(String name,String email,String role)
	{
		this.name=name;
		this.email=email;
		this.role=role;
	}
	String printParent()
	{
		return name+" "+email+" "+role;
	}
}

