class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello");
		char[] ch=s.toCharArray();
		for(int x=0;x<=ch.length-1;x++)
		{
			if(s.indexOf(ch[x])==s.lastIndexOf(ch[x]))
				System.out.println("unique "+ ch[x]);
			else
				System.out.println("Not unique "+ ch[x]);
		}
	}
}