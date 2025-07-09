class Main 
{
	public static void main(String args[]) 
	{
        	String str = "Hello all good morning";
        	System.out.println("Vowels in the string:");

        	for (int i = 0; i < str.length(); i++) 
		{
            		char ch = str.charAt(i);
            		if (isVowel(ch)) 
			{
                		System.out.println(ch);
            		}
        	}
    	}

        public static boolean isVowel(char ch) 
	{
        	ch = Character.toLowerCase(ch); 
        	return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    	}
}