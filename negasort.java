class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,-1,11,-2,12,-5,13,-3,14,15};
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				//if(a[x]<0 && a[y]<0 && a[x]<a[y])//-ve values dsc order
				if(a[x]>0  && a[x]>a[y])//negative values prints first then +ve values
				{
					int temp1=a[x];
					a[x]=a[y];
					a[y]=temp1;	
				}
			}
		}
			for(int temp:a)
			System.out.print(temp+" ");
	}
}