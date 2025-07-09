class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello");
		char ch=0;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				System.out.println(ch);
		}
	}
}