class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{1,2,3,4,5};
		int min=0,max=0;
		for(int x=1;x<a.length;x++)
		{
			if(a[min]>a[x])
				min=1;
		
			if(a[max]<a[x])
				max=x;
		}
		System.out.println(a[max]+a[min]);
	}
}