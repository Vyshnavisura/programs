class Main
{
	public static void main(String[] args)
	{
		String s=new String("ABCD");
		String s1=s+s;
		String s2="CDAB";
		System.out.println((s1.contains(s2))?"rotation":"not rotation");
	}
}