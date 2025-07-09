
import java.util.Scanner;
class Main
{	
	static int search;
	static String[] items;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter search number");
		search=sc.nextInt();
		sc.nextLine();
		System.out.println("enter "+search+" items with space");
		String i=sc.nextLine();
		items=i.split(" ");
		m1();
	}
	static void m1()
	{
		try
		{
			m2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("more than 5 searches");//user exception handler
		}
	}
	static void m2()
	{
		m3();
	}
	static void m3()
	{
		
		if(items.length>search)
		{
			throw new ArithmeticException();//user throwing the exception
		}
		else
		{
			System.out.println("items found");
		}
	}
}
