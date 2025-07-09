class Main
{
	public static void main(String[] args)
	{
		int n=5234,rem=0,c=0;
		while(n!=0)
		{
			rem=n%10;
			c=0;
			for(int x=2;x<=rem/2;x++)
			{
				if(rem%x==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
				System.out.println("prime: "+rem);
			else
				System.out.println("Not prime: "+rem);
			n/=10;
		}
	}
}