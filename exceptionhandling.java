/*class Main
{
	public static void main(String[] args)
	{
		try
		{
			int[] x=new int[]{10,20};
			System.out.println(x[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled1");
		}

		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled2");
		}
		try
		{
			String s=new String("good morning");
			s=s.toUpperCase();
			s=null;
			s=s.toLowerCase();
			System.out.println(s);
		}
		catch(NullPointerException s)
		{
			System.out.println("hy");
		}
	}
}*/



/*class Main
{
	public static void main(String[] args)
	{
		try
		{
			Object s="hello";
			int x=(int) (s);
			System.out.println(x);
		}
		catch(ClassCastException c)
		{
			System.out.println("typecast exception");
		}
	}
}*/


/*class Main
{
	public static void main(String[] args)
	{
		try
		{
			String s="abc";
			int x=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("numberformatexception");
		}	
	}
}*/

/*import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		try
		{
			System.out.println(10/n);
			int[] a=new int[n];
			System.out.println(a[n]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}*/


/*class Main
{
	public static void main(String[] args)
	{
		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ae");
		}
	}
}*/




/*import java.util.Scanner;
class Main
{static int search;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter search number");
		search=sc.nextInt();
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
		//int search=6;
		if(search>5)
		{
			throw new ArithmeticException();//user throwing the exception
		}
		else
		{
			System.out.println("items found");
		}
	}
}*/

/*import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		try
		{
			try
			{
				System.out.println(10/n);
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			throw new ArithmeticException();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}*/


/*import java.io.*;
class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		m1();
	}
	public static void m1() throws FileNotFoundException
	{
		m2();
	}
	public static void m2() throws FileNotFoundException
	{
		m3();
	}
	public static void m3() throws FileNotFoundException
	{
		FileReader file=new FileReader("C:\\Users\\LENOVO\\Desktop\\v1.txt");
		System.out.println("file found");
	}
}*/
/*checked exceptions
import java.util.Scanner;
import java.io.*;
class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String path="D:\\oops\\exceptionhandling.java";
		File file=new File(path);
		Scanner sc=new Scanner(file);
		int c=0,c1=0,c2=0;
		while(sc.hasNextLine())
		{	
			String s=sc.nextLine();
			c++;
			String[] s1=s.split(" ");
			for(int i=0;i<s1.length;i++)
			{
				c1++;
			}
			
			for(int y=0;y<s.length();y++)
			{
				char ch=s.charAt(y);
				c2++;
			}
		}
		System.out.println("number of words in file: "+c1);
		System.out.println("number of charcters in file: "+c2);
		System.out.println("number of lines in file: "+c);
	}

}*/
import java.io.*;
class Main
{
	public static void main(String[] args)
	{
		throw new SQLException();
	}
}



//dbs