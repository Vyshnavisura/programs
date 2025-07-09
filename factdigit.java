class Main
{
	public static void main(String[] args)
	{
		int n=53,end=1,p=1,p1=1;
		double res=0;
		int n1=n/10,n2=n%10;
		System.out.println(n1+" "+n2);
		for(int start=n1;start>=end;start--)
		{
			p=p*start;
		}
		System.out.println("fact of first digit: "+p);
		
		for(int start=n2;start>=end;start--)
		{
			p1=p1*start;
		}	
		System.out.println("fact of second digit: "+p1);
		res=(double)(p/p1);
		System.out.println(res);

	}
}