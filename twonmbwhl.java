class Main
{
	public static void main(String[] args)
	{
		int n=234,c=0,n1=n,rem=0,rem1=0,rev=0,mul=0,rem2=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			c++;
			n/=10;
			while(n1!=0)
			{
				rem1=n1%10;
				n1/=10;	
			
				while(rev!=0)
				{
					rem2=rev%10;
					rev/=10;
					mul=rem2*rem1;
					if(rev==c/2)
						break;
				}
			}
		}
		System.out.println(mul+""+rev);
	}
}