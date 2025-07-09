class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,25,40,5};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<(a.length-1-i);j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int x=0;x<a.length;x++)
			System.out.print(a[x]+" ");
		//System.out.println(Arrays.toString(a));
	}
}