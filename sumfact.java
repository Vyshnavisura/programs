class Main
{
	public static void main(String[] args)
	{
		int num=8,end=num,sum=0;
		for(int start=1;start<=8;start++)
		{
			if(num%start==0)
			sum=sum+start;
		}
		System.out.println("sum of factors is: "+sum);
	}
}