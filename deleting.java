class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,35,40,50,60};
		int index=3;a[index]=0;
		for(int x=index;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		a[a.length-1]=0;
		for(int y=0;y<a.length;y++)
			System.out.println(a[y]);
	}

}