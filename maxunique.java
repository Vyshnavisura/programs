class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,23,21,10,23,40,67};
		int[] b=new int[a.length];
		int x,y;
		int max=Integer.MIN_VALUE;
		for(x=0;x<a.length;x++)
		{
			int c=1;
			if(b[x]==1)
				continue;
			for(y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					c++;
					b[y]=1;		
				}
			}
			if(c==1)
			{
				if(a[x]>max)
				max=a[x];
			}	
		}
		System.out.println(max);
		
	}
}