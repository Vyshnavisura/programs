class Main
{
	public static void main(String[] args)
	{
		int sum=0;
		int a[]=new int[]{1,198};
		for(int i=0;i<=a.length-1;i++)
		{
			sum+=a[i];
		}
		while(!(sum>=1 && sum<=9))
		{
			int sum1=0;
			while(sum!=0)
			{
				sum1+=sum%10;
				sum/=10;
			}
			sum=sum1;
		}
		if(sum==1)
			System.out.println(sum+" inav");
		else
			System.out.println(sum+" not inav");
	}
}