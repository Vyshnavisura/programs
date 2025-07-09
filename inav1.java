class Main
{
	public static void main(String[] args)
	{
		int n=199,rem=0,sum=0,c=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		int sum1=0;
		while(sum!=1)
		{
			rem=sum%10;
			sum1=sum1+rem;
			c++;
			sum/=10;
		}
		if(c>1)
		{
			int sum2=0,c1=0;
			while(sum1!=1)
			{
				rem=sum1%10;
				sum2=sum2+rem;
				c1++;
				sum/=10;
			}
			c=c1;
			if(sum2==1)
				System.out.println("in");
			else
				System.out.println("ni");
		}
		else if(c==1 && sum1==1)
			System.out.println("in");
		else
			System.out.println("ni");
			
	}
}