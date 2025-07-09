class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello");
		char[] ch=s.toCharArray();
		for(int x=0;x<2;x++)
		{
			char temp=ch[0];
			for(int y=0;y<ch.length-1;y++)
			{
				ch[y]=ch[y+1];
			}
			ch[ch.length-1]=temp;
		}
		for(int x=0;x<ch.length;x++)
		{
			System.out.println(ch[x]);
		}
	}
}