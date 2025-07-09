class Main
{
	public static void main(String[] args)
	{	
		int num=15,end=1,n=0;
		for(int start=(num/2);start>=end;start--)
		{
			if(num%start==0)
			
			n=start;
		}
		System.out.println("min factor is: "+n);
	}
}