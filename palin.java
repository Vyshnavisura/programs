class Main
{
	public static void main(String[] args)
	{
		int n=121,rev=0,rem=0,n1=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==n1)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}
}