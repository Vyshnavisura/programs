class Main
{
	public static void main(String[] args)
	{
		int first=0,secd=1,third=0,num=10;
		for(int start=1;start<=num;start++)
		{
			third=first+secd;
			first=secd;
			secd=third;
			if(start==11)
			{
				break;
			}
		}
		System.out.println(first);
	}
}