class Main
{
	public static void main(String[] args)
	{
		int x;
		for(x=10;x<=1000;x++)
		{
			int n=x,rev=0,n1=n;
			while(n!=0)
			{
				rev=rev*10+(n%10);
				n/=10;
			}
			if(rev==n1)
			{
				int n2=rev,i=2,c=0;
				while(i<=n2/2)
				{
					if(n2%i==0)
					{	
						c++;
						break;
					}
					i++;
				}
				if(c==0)
					System.out.println(x+" is palindromic prime ");
			}
		}
	}
}