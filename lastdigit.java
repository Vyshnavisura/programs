class Main
{
	public static void main(String[] args)
	{
		int end=20,sum=0,num=0,p=1,n2=0;
		double n1=0;
		for(int start=10;start<=end;start++)
		{
			num=start%10;
			sum=sum+num;
			p=p*num;
			System.out.println(num);
		}
		System.out.println("sum of lastdigits is: "+ sum);
		System.out.println("product of lastdigits is: "+p);
		n1=Math.sqrt(num);
		n2=(int)n1;
		if(n1==n2)
		System.out.println("perfact sqrs: "+num);
	}
}