class Main
{
	public static void main(String[] args)
	{
		int num=8,end=num,count=0;
		for(int start=1;start<=8;start++)
		{
			if(num%start==0)
			count++;
		}
		System.out.println("count of factors is: "+count);
	}
}