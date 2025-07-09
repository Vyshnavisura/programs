class Main
{
	public static void main(String[] args)
	{
		int y,c1=0;
		for(y=10;y<=100;y++)
		{
			int n=y,c=0;
			for(int x=2;x<=n/2;x++)
			{
				if(n%x==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				c1++;
				System.out.print(y +" ");
		
			}	
		}
		System.out.println();
		System.out.print("count: "+c1);
	}
}