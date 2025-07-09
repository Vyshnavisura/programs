class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{30,20,56,78};
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>a[x+1])
			{
				a[x]=a[x]^a[x+1];
				a[x+1]=a[x]^a[x+1];
				a[x]=a[x]^a[x+1];	
				System.out.println(a[x]+" "+a[x+1]);
			}
			else
				System.out.println(a[x]+" "+a[x+1]);
		}
	}
}