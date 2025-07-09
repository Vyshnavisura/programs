class Main
{
	public static void main(String[] args)
	{
		int a[]=new int[]{12,22,100,2,5};
		int sum=0,sum1=0,c=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];	
			}
		}
		int n=sum,rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;	
		}
		if(rev==sum)
			System.out.println(sum+" palindrome");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				sum1+=a[i];	
			}	
		}
		for(int i=2;i<=sum1/2;i++)
		{
			if(sum1%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0)
			System.out.println(sum1+" prime");
		
	}
}