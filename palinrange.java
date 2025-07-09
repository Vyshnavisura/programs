class Main
{
	public static void main(String[] args)
	{
		int x;
		for(x=10;x<=1000;x++)
		{
			int n=x,rev=0,n1=n;
			while(n!=0)
			{
				rev=rev*10+(n%10);
				n/=10;
			}
			if(rev==n1)
				System.out.print(x+" ");
		}
	}
}