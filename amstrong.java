class Main
{
	public static void main(String[] args)
	{
		int n=371,c=0,rem=0,rev=1,sum=0,n1=n;
		while(n!=0)
		{
			c++;
			n/=10;
		}
		n=n1;
		while(n!=0)
		{
			rem=n%10;
			sum+=(int)(Math.pow(rem,c));
			n/=10;
		}
		System.out.println(sum);
		if(sum==n1)
			System.out.println("amstromg");
		else
			System.out.println("not amstrong");
	}
}