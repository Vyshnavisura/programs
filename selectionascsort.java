class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{7,1,2,6,3,8,4,5};
		int x,y,min;
		for(y=0;y<a.length;y++)
		{
			min=y;
			for(x=y+1;x<a.length;x++)
			{
				if(a[min]<a[x])
					min=x;	
			}
			int temp=a[min];
			a[min]=a[y];
			a[y]=temp;
			System.out.print(a[y]+" ");
		}
	}
}