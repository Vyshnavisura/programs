class Main
{
	public static void main(String[] args)
	{
		String s="Apple 1234";
		int sum=0;
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(Character.isDigit(ch))
			{
				int n=Character.getNumericValue(ch);
				sum+=n;
			}
		}
		System.out.println(sum);
	}
}