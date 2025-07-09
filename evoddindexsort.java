class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,11,12,13,14,15};
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{	
				if(x%2==0 && y%2==0 && a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;		
				}
				else if(x%2!=0 && y%2!=0 && a[x]<a[y])
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