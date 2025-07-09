class Main
{
	public static void main(String[] args)
	{
		int num=17,f=0,s=1,t=0,c=0;
		if(num%2==0)
		{
			for(int i=1;i<=(num-1);i++)
			{
				t=f+s;
				f=s;
				s=t;	
			}
			System.out.println(f);
		}
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
					c++;
			}
			if(c==0)
				System.out.println("prime");
			else
				System.out.println("not prime");
		}
		
	}
}