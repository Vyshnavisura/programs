class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,70,80,90,100};
		for(int y=1;y<=6;y++)
		{
			int temp=a[0];
			for(int x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
}