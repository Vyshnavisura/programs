class Main
{
	public static void main(String[] args)
	{
		int n=12000,c=0,c1=0,rem=0,rem1=0,rev=0,count=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			c++;
			n/=10;
		}
		while(rev!=0)
		{
			rem1=rev%10;
			c1++;
			switch(rem1)
			{
			case 0 :
				System.out.println("zero");
			break;
			case 1 :
				System.out.println("one");
			break;
			case 2 :
				System.out.println("two");
			break;
			case 3 :
				System.out.println("three");
			break;
			case 4 :
				System.out.println("four");
			break;
			case 5 :
				System.out.println("five");
			break;
			case 6 :
				System.out.println("six");
			break;
			case 7 :
				System.out.println("seven");
			break;
			case 8 :
				System.out.println("eight");
			break;
			case 9 :
				System.out.println("nine");
			break;
			}
			rev/=10;
		}
		count=c-c1;
		while(count>0)
		{
			System.out.println("zero");
			count--;
		}	
	}
}