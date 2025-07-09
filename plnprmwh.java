class Main
{
	public static void main(String[] args)
	{
		int n=171,i=2,c=0,rem=0,rev=0,n1=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==n1)
		{
			while(i<=n/2)
			{
				if(n%i==0)	
					c++;
				i++;
			}
			if(c==0)
				System.out.println("palindromic prime");
			else
				System.out.println("not palindromic prime");
		}
		else
			System.out.println("not palindrome");		
	}
}