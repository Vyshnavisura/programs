class Main
{
	public static void main(String[] args)
	{
		String s=new String("mom and dad");
		String s1[]=s.split(" ");
		for(int x=0;x<s1.length;x++)
		{
			String word=s1[x];
			StringBuffer sb=new StringBuffer(word);
			sb.reverse();
			if(word.contentEquals(sb))
				System.out.println(s1[x]);
		}
			
	}
}