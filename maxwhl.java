class Main
{
	public static void main(String[] args)
	{
		int n=4654,max=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			if(rem>max)
				max=rem;
		}
		System.out.println(max);
	}
}

