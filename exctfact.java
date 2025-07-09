class Main
{
	public static void main(String[] args)
	{
		int n1=2345,rem=0,sum=0;
		while(n1!=0)
		{
			rem=n1%10;
			System.out.print(rem+" --> ");
			int n=rem,p=1;
			for(int i=n;i>=1;i--)
			{
				p=p*i;
				sum=sum+p;
				System.out.print(p+" ");
			}
			System.out.println();
			n1/=10;	
		}
		System.out.println("sum of factorials: "+sum);
	}
}   