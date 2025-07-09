class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello all good morning");
		String s1[]=s.split(" ");
		for(int x=0;x<s1.length;x++)
		{
			char ch=s1[x].charAt(0);
			char ch1=s1[x].charAt(s1[x].length()-1);
			String mid=s1[x].substring(1,s1[x].length()-1);
			String swap=ch1+mid+ch;
			System.out.print(swap+" ");
		}
	}
}