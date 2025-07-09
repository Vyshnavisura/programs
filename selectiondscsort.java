class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{1,2,6,3,8,4,5};
		int x,y,max;
		for(y=0;y<a.length;y++)
		{
			max=y;
			for(x=y+1;x<a.length;x++)
			{
				if(a[max]<a[x])
					max=x;	
			}
			int temp=a[max];
			a[max]=a[y];
			a[y]=temp;
			System.out.print(a[y]+" ");
		}
	}
}