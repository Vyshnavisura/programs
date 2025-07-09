class Main
{
	public static void main(String[] args)
	{
		int n=23457,rem=0;
		while(n!=0)
		{
			rem=n%10;
			System.out.print(rem+"-->");
			n/=10;
			int f=0,s=1,t=0,num=rem;
			for(int start=1;start<=num;start++)
			{
				if(start==num)
					System.out.println( f);
					t=f+s;
					f=s;
					s=t;
			}
		}
	}
}