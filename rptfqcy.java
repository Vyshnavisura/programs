class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,10,20,40,40,10,40,20,20,80,90,40};
		int[] b=new int[a.length];
		int x;
		int max=0,max1=0;
		for(x=0;x<a.length;x++)
		{
			int c=1,c1=0;
			if(b[x]==1)
				continue;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{	
					c1=c;
					c++;
					b[y]=1;				
					if(c>c1)
					{
						max=c;
					}
						
				}
			}
	
		}
		for(x=0;x<a.length;x++)
		{
			int c2=1;
			if(b[x]==1)
				continue;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					c2++;
					b[y]=1;		
				}
			}
			if(c2==max)
				System.out.println("most repeated: "+a[x]);
			if(c2==(max-1))
				System.out.println("second most repeated: "+a[x]);
		}
	}
}