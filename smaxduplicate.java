class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,10,20,40,40,10,40,20,20,80,90,40};
		int[] b=new int[a.length];
		int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
		for(int x=0;x<a.length;x++)
		{
			int c=1;
			if(b[x]==1)
				continue;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					c++;
					b[y]=1;
						
				}
			}
			if(c>1)
			{
				if(a[x]>max)
				{
					smax=max;
					max=a[x];
				}
				else if(a[x]>smax)
				{
					smax=a[x];
					
				}
				
			}
	
		}
		System.out.println(smax);
		
	}
}