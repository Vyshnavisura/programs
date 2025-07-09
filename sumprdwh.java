class Main
{
	public static void main(String[] args)
	{
		int num=2345,rem,sum=0,p=1;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
			p=p*rem;
		}
		System.out.println(sum);
		System.out.println(p);
	}
}