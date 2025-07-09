class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello");
		char[] ch=s.toCharArray();
		int[] s1=new int[ch.length];
		for(int x=0;x<=ch.length-1;x++)
		{
			int c=1;
			if(s1[x]==1)
				continue;
			for(int y=x+1;y<ch.length;y++)
			{
				if(ch[x]==ch[y])
				{
					c++;
					s1[y]=1;
				}
			}
			if(c==1)
			System.out.println(ch[x]+" "+c);	
		}
	}
}