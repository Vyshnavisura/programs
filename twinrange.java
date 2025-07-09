class Main
{
	public static void main(String[] args)
	{
		for(int y=1;y<=100;y++)
		{
			int n=y,n1=n+2,c=0,c1=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					c++;
					break;
				}
			}
		
			if(c==0 && n!=1)
			{
				for(int x=2;x<=n1/2;x++)
				{
					if(n1%x==0)
					{
						c1++;
						break;
					}
				}
				if(c1==0)
					System.out.println(n+" && "+n1+" twin primes");
			}
		
		}
		
	}
}