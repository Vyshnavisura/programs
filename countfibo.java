class Main
{
	public static void main(String[] args)
	{
		int first=0,secnd=1,third=0,end=8,c=0;
		for(int start=1;start<=end;start++)
		{
			System.out.println(first);
			c++;
			third=first+secnd;
			first=secnd;
			secnd=third;
		}
		System.out.println(c);
	}
}