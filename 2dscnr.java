import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		int[][] a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		int x,y;
		for(x=0;x<a.length;x++)
		{
			for(y=0;y<a[x].length;y++)
			{
				a[x][y]=sc.nextInt();
			}
		}
		for(x=0;x<a.length;x++)
		{
			for(y=0;y<a[x].length;y++)
			{
				System.out.print(a[x][y]+"\t");
			}
			System.out.println();
		}
	}
}