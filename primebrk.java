class Main
{
	public static void main(String[] args)
	{
		int num=7,end=num/2,c=0;
		for(int start=2;start<=end;start++)
		{
			if(num%2==0)
			{
				c++;
				break;
			}
		}
			if(c==0)
				System.out.println("prime");
			else
				System.out.println("not prime");
		
	}
}