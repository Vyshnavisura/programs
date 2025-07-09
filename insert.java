class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,0};
		int x,index=3;
		for(x=a.length-1;x>=index+1;x--)
		{
			a[x]=a[x-1];
		}
			a[index]=25;
		for(int y=0;y<a.length;y++)
		System.out.println(a[y]);
	}
}