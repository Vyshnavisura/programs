class Main
{
	public static void main(String[] args)
	{
		int n=5,sq=n*n,rem=0,sum=0;
		while(sq!=0)
		{
			rem=sq%10;
			sum=sum+rem;
			sq/=10;
		}
		if(n==sum)
			System.out.println("equal");
		else
			System.out.println("not equal");	
		
	}
}