class Main
{
	public static void main(String[] args)
	{
		int n=345,rev=0,n1=n,sum=0,rev1=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		if(rev==n1)
		
			System.out.println("palindrome");
		else
		{
			sum=n1+rev;
			while(true)
			{
				rev1=rev1*10+sum%10;
				sum/=10;
				if(rev1==sum)
					System.out.println("palin");	
			sum=rev1+sum;
			}
		}
		
	}
}