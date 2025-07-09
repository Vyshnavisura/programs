class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{34,555,22,33,55,66,65,32};
		System.out.print("even index values: ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("odd index values: ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2!=0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("even index even values: ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0 && a[i]%2==0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("odd index odd values: ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2!=0 && a[i]%2!=0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("even index odd values: ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0 && a[i]%2!=0)
				System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.print("odd index even values: ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2!=0 && a[i]%2==0)
				System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.print("5th element: ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i==(5-1))
				System.out.print(a[i]);
		}
		System.out.println(" ");
		System.out.print("last element: "+a[a.length-1]);
	}
}