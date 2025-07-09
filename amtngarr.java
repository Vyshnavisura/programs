class Main
{
	public static void main(String[] args)
	{
		Main main=new Main();
		int[] a=new int[]{371,123,234};
			for(int x=0;x<=(a.length-1);x++)
			{
				int  n=a[0],copy=n,sum=0,c1=0,rev=0,c=0,rem=0;
				while(n!=0)
				{
					c++;
					n/=10;
				}
				n=copy;
				while(n!=0)
				{
					rem=n%10;	
					sum+=(int)(Math.pow(rem,c));
					n/=10;
				}
				if(sum==copy)
					c1++;
					System.out.println(sum);
			}
				
			
	}
}