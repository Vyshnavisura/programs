class Main
{
	public static void main(String[] args)
	{
		int i;
		for(i=1;i<=500;i++)
		{
			int n=i,c=0,rem=0,sum=0,n1=n;
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
			if(sum==n1)
				System.out.print(i+" ");
		}
	}
}