class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello");
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(x==0 && (ch>='a' && ch<='z'))
			{
				ch=(char)(ch-32);
				s1=s1+ch;
			}
			else if(x==0 && (ch>='A' && ch<='Z'))
			{
				ch=(char)(ch+32);
				s1=s1+ch;
			}
			else
				s1=s1+ch;
		}
		System.out.println(s1);
	}
}