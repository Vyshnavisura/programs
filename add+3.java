class Main
{
	public static void main(String[] args)
	{
		int end=20;
		for(int start=1;start<=end;start++) //(start+=3)
		{
			System.out.println(start);
			start+=2;//without this
		}
	}
} 