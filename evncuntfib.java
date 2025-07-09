class Main
{
	public static void main(String[] args)
	{	
		int f=0,s=1,t=0,c=0;
		for(int i=1;i<=10;i++)
		{
			if(f%2==0)
			{
				c++;
				System.out.println(f);
			}
			t=f+s;
			f=s;
			s=t;
		}
		System.out.println(c);
	}
}