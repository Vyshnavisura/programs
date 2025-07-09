class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello all good morning");
		char[] ch=s.toCharArray();String compare="";
		for(int x=0;x<=ch.length-1;x++)
		{
			char s2=ch[x];
			if(s.indexOf(ch[x])!=s.lastIndexOf(ch[x]))
			{
				if(compare.indexOf(s2)==-1)
				System.out.println(s2);
				compare+=s2;
			}
			//else
				//System.out.println("unique "+ ch[x]);
		}
	}
}