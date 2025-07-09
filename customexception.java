/*class Main
{
	public static void main(String[] args) throws XyzException
	{
		throw new XyzException("xyz exception"); 
	}
}
class XyzException extends Exception
{
	public XyzException(String msg)
	{
		super(msg);
	}
}*/


import java.util.Scanner;
class Main
{
	static int search;
	static String[] items;
	public static void main(String[] args) throws ItemsNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter search number");
		search=sc.nextInt();
		sc.nextLine();
		System.out.println("enter "+search+" items with space");
		String i=sc.nextLine();
		items=i.split(" ");
		if(items.length<=search)
			System.out.println("items found");
		else
			throw new ItemsNotFoundException("more items searched");
	}
}

class ItemsNotFoundException extends Exception
{
	public ItemsNotFoundException(String msg)
	{
		super(msg);
	}
}

























