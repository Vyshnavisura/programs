class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				smax=max;
				max=a[x];
			}	
			else if(smax<a[x] &&a[x]<max)
				smax=a[x];
		}
		System.out.println(smax);
	}
}