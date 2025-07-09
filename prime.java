class Main
{
	public static void main(String[] args)
	{
		int num=8,end=num,count=0;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
				count++;
		}
		if(count==2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}
