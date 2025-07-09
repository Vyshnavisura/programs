class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello al good morning");
		String[] s1=new String[]{"hello","all","good","all","morning"};
		
		char[] ch=s.toCharArray();
		for(int x=0;x<ch.length;x++)
		{
			if(s.indexOf(ch[x])==s.lastIndexOf(ch[x]))
				System.out.println(ch[x]);
		}
	}
}