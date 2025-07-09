import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		int[][] a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		int max=0,s=0;
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
				/*if(x==y)//left daidonal
				if(x+y==a.length-1)//right
				if(a[x][y]>a[x+1][y+1])
					max=a[x][y];
				//System.out.print(max+"\t");*/
				s+=a[x][y];
				
			}
			System.out.print(s+"\t");
			System.out.println();
		}
	}
}