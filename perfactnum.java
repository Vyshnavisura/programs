class Main
{
	public static void main(String[] args)
	{
		int num=10,end=num,sum=0,p=1;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
			
			sum=sum+start;
			p=p*start;
		}
		System.out.println("sum is: "+sum+" "+"product is: "+p);
		if(sum==p)
			System.out.println("perfact number");
		else
			System.out.println("not perfact number");
	}
}