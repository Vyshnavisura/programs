class Main
{
	public static void main(String[] args)
	{
		int num=2345,rem=0;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			if(rem%2==0)
				System.out.println("evn num: "+rem);
			else
				System.out.println("odd num: "+rem);
		}
	}
}