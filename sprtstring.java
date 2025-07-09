class Main
{
	public static void main(String[] args)
	{
		String s= new String("Hell!o@#$1245");
		String s1="",s2="",s3="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
				s1=s1+ch;
			else if(ch>='0' && ch<='9')
				s2=s2+ch;
			else
				s3=s3+ch;
		}
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
	}
}