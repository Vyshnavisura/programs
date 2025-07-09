class Main
{
	public static void main(String[] args)
	{
		int end=1,num=5,p=0;
		for(int start=10;start>=end;start--)
		{
			p=num*start;
			if(p%2==0 && p%4==0)
			System.out.println(num+"X"+start+"="+p);
		}
	}
}