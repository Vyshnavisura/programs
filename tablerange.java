class Main
{
	public static void main(String[] args)
	{
		int i;
		for(i=1;i<=5;i++)
		{
			int end=10,num=i;
			for(int start=1;start<=end;start++)
			{
				int num1=start*num;
				System.out.println(num + " X " + start + " = " + num1);
			}
			System.out.println(" ");
		}
		
	}

}