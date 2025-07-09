class Main
{
	public static void main(String[] args)
	{
		int n=1234,c=0,rem=0,sum=0,sum1=0;
		while(n!=0)
		{
			rem=n%10;
			c++;
			n/=10;
			if(c%2!=0)
				sum=sum+rem;
			else
				sum1=sum1+rem;
		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum*sum1);
	}
}