class Main
{
	public static void main(String[] args)
	{
		int end=1,n=5,r=2,p=1,n1=n-r,p1=1;
		for(int start=n;start >=end;start--)
		{
			p=p*start;
		}
		System.out.println(p);
		
		for(int start=n1;start>=end;start--)
		{
			p1=p1*start;	
		}
		System.out.println(p1);
		System.out.println(p/p1);

	}
}