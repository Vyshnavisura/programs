class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{1,2,3,4,5};
		int[] b=new int[a.length];
		System.out.println("copy of a to b: ");
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[x];
			System.out.print(b[x]+" ");
		}

		System.out.println();
		System.out.println("copying reversly: ");
		for(int x=a.length-1;x>=0;x--)
		{
			b[x]=a[x];
			System.out.print(b[x]+" ");
		}

		System.out.println();
		System.out.println("even indices to b: ");
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2==0)
			{
				b[x]=a[x];
				System.out.print(b[x]+" ");
			}
		}

		System.out.println();
		System.out.println("odd indices to b: ");
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2!=0)
			{
				b[x]=a[x];
				System.out.print(b[x]+" ");
			}
		}

		System.out.println();
		System.out.println("reverse half of a to b: ");
		for(int x=(a.length-1)/2;x>=0;x--)
		{
			b[x]=a[x];
			System.out.print(b[x]+" ");
			
		}

		System.out.println();
		System.out.println("even indices asc: ");
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2==0)
			{
				if(b[x]<=a[x])
				System.out.print(b[x]+" ");
			}
		}

		System.out.println();
		System.out.println("odd indices dsc: ");
		int v=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2!=0)
			{
				
				b[x]=a[x];
				v=b[x];
				if(v>=b[x])
				{
					System.out.print(v+" ");
				}
			}
		}
	}
}