class Main
{
	public static void main(String[] args)
	{
		Child2 child2=new Child2();
		System.out.println(child2.add());
		System.out.println(child2.sub());
		System.out.println(child2.mul());
		System.out.println(child2.div());
		System.out.println(child2.mod());
	}
}
class Child2 extends Child1
{
	public int mod()
	{
		return 1%2;
	}
}
abstract class Child1 extends Parent
{
	public int mul()
	{
		return 1*2;
	}
	public int div()
	{
		return 1/2;
	}
}
abstract class Parent
{
	public int add()
	{
		return 1+2;
	}
	public int sub()
	{
		return 1-2;
	}
	public abstract int mul();
	public  abstract int div();
	public  abstract int mod();
}