class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30};
		int[] b=new int[]{40,50};
		int[] c=new int[a.length+b.length];
		int x;
		for(x=0;x<a.length;x++)
		{
			c[x]=a[x];
		}
		int index=a.length;
		for(x=0;x<b.length;x++)
		{
			c[index]=b[x];
			index++;
		}
		for(int temp:c)
			System.out.println(temp);
	}
}