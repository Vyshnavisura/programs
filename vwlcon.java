class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello all good morning");
		String s1="";
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				s1+=ch;
			else if(ch !=' ')
				s2+=ch;
		}
		System.out.println(s=(s1.concat(s2)));
	}
}