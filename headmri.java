class Main
{
	public static void main(String[] args) 
	{
        	String s="Hello all good morning";
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
            		char ch = s.charAt(i);
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				s1+=ch;
			}
		}
		System.out.println(s1);
	}
}