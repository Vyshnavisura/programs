class Main
{
	public static void main(String[] args)
	{
		int f=0,s=1,t=1,f1=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println(f);
			f1=f+s+t;
			f=s;
			s=t;
			t=f1;
		}
	}
}