class Main
{
	public static void main(String[] args)
	{
		int n=988974,rem=0,a=0;
		char b=0,rem1=0;
		while(n!=0)
		{
			rem=n%100;
			n/=100;
			rem1=(char)rem;
			System.out.println("before covert: "+rem1);
			if(rem1>='A' && rem1<='Z')
			{
				a=(int)rem+32;
				b=(char) a;
				System.out.println("after convert: "+b);
			}
			else if(rem1>='a' && rem1<='z')
			{
				a=(int)rem-32;
				b=(char) a;
				System.out.println("after convert: "+b);
			}
			else
				System.out.println(rem);	
		}
	}
}