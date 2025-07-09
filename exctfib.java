class Main
{
	public static void main(String[] args)
	{
		int n=234,rem=0;
		int f=0,s=1,t=0;
		while(n!=0)
		{
			rem=n%10;
			System.out.print(rem+" ");
			//int f=0,s=1,t=0;
			for(int i=1;i<=rem;i++)
			{
				System.out.print(f+" ");
				t=f+s;
				f=s;
				s=t;
			}
			
			System.out.println();
			n/=10;
		}
	}
}