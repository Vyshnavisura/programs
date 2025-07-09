class Main
{
	public static void main(String[] args)
	{
		int start,end=20;
		for(start=1;start<=end;start++)
		{
			if(start%3==0)
				continue;
			System.out.println(start);
		}
	}
}