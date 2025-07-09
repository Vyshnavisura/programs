class Main
{
	public static void main(String[] args)
	{
		int a[]=new int[]{11,12,13,14,15};
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("first half: ");
		for(int i=0;i<=(a.length-1)/2;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("second half: ");
		for(int i=((a.length-1)/2)+1;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("reverse of first half: ");
		for(int i=(a.length-1)/2;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("second half: ");
		for(int i=((a.length-1)/2)+1;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("first half: ");
		for(int i=0;i<=(a.length-1)/2;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("reverse of second half: ");
		for(int i=a.length-1;i>=((a.length-1)/2)+1;i--)
		{
			System.out.println(a[i]);
		}
		
	}
}