import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("array size:");
		int index=sc.nextInt();
		System.out.println("enter values: ");
		int a[]=new int[index];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
	}
}



