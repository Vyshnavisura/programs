class Main
{
	public static void main(String[] args)
	{
		int n1=5,n2=7,end1=n1,end2=n2,c1=0,c2=0;
		if(n1-n2==2||n2-n1==2)
		{
			for(int start=1;start<=end1;start++)
			{
				if(n1%start==0)
					c1++;
				
			
			}
			//System.out.println(c1);
			for(int start=1;start<=end2;start++)
			{
				if(n2%start==0)
					c2++;
				
			
			}
			//System.out.println(c2);
			if(c1==2 && c2==2)
				System.out.println("Twin primes");
			else
				System.out.println("not twin primes");
		}
	}
}