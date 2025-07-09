class Main
{
	public static void main(String[] args)
	{
		int n=15;
		while(!(n<=0))
		{
			if(n%2==0)
				n=n-4;
			else
				n=n+3;
		System.out.println(n);
		}
	}
}