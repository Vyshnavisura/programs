class Main
{
	public static void main(String[] args)
	{
		int num=8,end=num,p=1;
		for(int start=1;start<=8;start++)
		{
			if(num%start==0)
			p=p*start;
		}
		System.out.println("product of factors is: "+p);	
	}
}