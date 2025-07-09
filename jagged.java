import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		int[][] a=new int[3][];
		Scanner sc=new Scanner(System.in);
		int x,y;
		int c=0,c1=0,max=0;
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
				if(a[x][y]%2==0)
				{
					c1=c;
					c++;
				}
				if(c>c1)
					max=a[x][y];
				
			}
		}
		for(x=0;x<a.length;x++)
		{
			for(y=0;y<a[x].length;y++)
			{
				System.out.println(a[x][y]+" ");
			}
		}
	}
}