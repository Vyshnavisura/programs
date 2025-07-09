class Main
{
	public static void main(String[] args)
	{
		int num=48,n1=num/10,n2=num%10,f=0,s=1,t=0,f1=0,s1=1,t1=0;
		for(int i=1;i<=n1;i++)
		{
			System.out.print(f+" ");
			t=f+s;
			f=s;
			s=t;
		}
		System.out.println();
		for(int i=1;i<=n2;i++)
		{
			System.out.print(f1+" ");
			t1=f1+s1;
			f1=s1;
			s1=t1;
		}

	}
}