class Main
{
	public static void main(String[] args)
	{
		int n=1234,n1=n,c=0,c1=0,rem=0,sum=0,sum1=0;
		while(n!=0)
		{
			c++;
			n/=10;
		}
		n=n1;
		int a=(int)(Math.pow(10,c/2+1));
		while(n!=0)
		{
			rem=n%a;
			n/=a;	
			sum=sum+rem;
			System.out.println(rem);	
		}
		System.out.println(sum);
		
	}
}