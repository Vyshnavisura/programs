class Main
{
	public static void main(String[] args)
	{	
		int num=16,end=num/2,n=0;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
			
			n=start;
		}
		System.out.println("max factor is: "+n);
	}
}