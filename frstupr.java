class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello all good morning");
		String s1[]=s.split(" ");
		for(int x=0;x<s1.length;x++)
		{
			char ch=s1[x].charAt(0);
			s1[x]=s1[x].replace(ch,Character.toUpperCase(ch));
			System.out.print(s1[x]+" ");		
		}
		
	}
}