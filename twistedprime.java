class Main
{
	public static void main(String[] args)
	{
	int n1=17,n2=71,c1=0,c2=0,rem=0;
	
	for(int start=2;start<=(n1/2);start++)
	{
		if(n1%start==0)
			c1++;
	}
	for(int start=2;start<=(n2/2);start++)
	{
		if(n2%start==0)
			c2++;
	}
	if(c1==0 && c2==0)
		System.out.println("Twisted primes");
	else
		System.out.println("not twisted primes");
	}
}