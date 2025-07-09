class Main
{
	public static void main(String[] args)
	{
		String s="hello";
		for(int x=0;x<=s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				String s2=(s.substring(x,y));
				if(!(s2.contains("a")||s2.contains("e")||s2.contains("i")||s2.contains("o")||s2.contains("u")))
					System.out.println(s2);
			}
		}
	}
}


