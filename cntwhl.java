class Main
{
	public static void main(String[] args)
	{
		int i=1;
		System.out.println(i);
		while(i<10)
		{
			i++;
			if(i==6)
				continue;
				
			System.out.println(i);
		}
	}
}