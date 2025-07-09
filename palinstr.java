class Main
{
	public static void main(String[] args)
	{
		String s=new String("mada");
		StringBuffer s1=new StringBuffer(s);
		s1.reverse();
		if(s.contentEquals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}