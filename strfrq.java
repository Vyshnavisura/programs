class Main
{
	public static void main(String[] args)
	{
		String[] a=new String[]{"hello","all","good","morning","all","morning"};
		String[] b=new String[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			int c=1;
			if(b[x]==("1"))
				continue;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==(a[y]))
				{
					c++;
					b[y]="1";
				}
			}
			System.out.println(a[x]+" "+(c));
		}
	}
}