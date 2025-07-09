class Main
{
	public static void main(String[] args)
	{
		int end=10;
		for(int start=1;start<=10;start++)
		{
			int num=start;
			if(num%2==0)
				System.out.println("even numbers: "+num);
		}
		for(int start=1;start<=10;start++)
		{
			int num=start;
			if(num%2!=0)
				System.out.println("odd numbers: "+num);
		}
	}
}