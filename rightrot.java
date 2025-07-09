class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,70,80,90,100};
		for(int y=0;y<=6;y++)
		{
			int temp=a[a.length-1];
			for(int x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
			}
			a[0]=temp;
		}
		for(int i=0;i<=a.length-1;i++)
		System.out.println(a[i]);
	}
}