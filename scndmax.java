class Main
{
	public static void main(String[] args)
	{
		int n=2314,max=0,rem=0,n1=n,rem1=0,max1=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem>max)
			{
				max1=max;
				max=rem;
			}
			else if(rem>max1 && rem<max)
				max1=rem;
			n=n/10;
		}
		System.out.println(max);
		System.out.println(max1);
	}
}
