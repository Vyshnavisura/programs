class Main
{
	public static void main(String[] args)
	{
		String s="aPPLE 123",s2="",num="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(Character.isUpperCase(ch))
				s2+=Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch))
				s2+=Character.toUpperCase(ch);
			else if(Character.isDigit(ch))
				num+=ch;
			else
				s2+=ch;
			
		}
		System.out.println(s2+"\n"+num);
	}
}