class Main
{
	public static void main(String[] args)
	{
		int n1=11,i=2,c=0,rem=0,rev=0,c1=0;
		while(i<=n1/2)
		{
			if(n1%i==0)
			{
				c++;
				break;
			}
			i++;
		}
		if(c==0)
		{
			while(n1!=0)
			{
				rem=n1%10;
				rev=rev*10+rem;
				n1=n1/10;
			}
			i=2;
			while(i<=rev/2)
			{
				if(rev%i==0)
				{
					c1++;
					break;
				}
				i++;	
			}
		}
		if(c==0 && c1==0)
			System.out.println("twisted primes");
		else
			System.out.println("not twisted primes");
	}
}