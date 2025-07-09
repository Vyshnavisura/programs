class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello");
		char[] ch=s.toCharArray();
		for(int x=0;x<ch.length-1;x++)
		{
			for(int y=0;y<(ch.length-1-x);y++)
			{
				if(ch[y]>ch[y+1])
				{
					char temp=ch[y];
					ch[y]=ch[y+1];
					ch[y+1]=temp;
				}
			}
		}
		for(int x=0;x<ch.length;x++)
		System.out.println(ch[x]);
	}
}