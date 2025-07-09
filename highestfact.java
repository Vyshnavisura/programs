class Main
{
	public static void main(String[] args)
	{
		int num=8,end=num,highest=0;
		for(int start=1;start<=8;start++)
		{
			if(num%start==0)
			highest=start;	
		}
		System.out.println("highest factors is: "+highest);
	}
}