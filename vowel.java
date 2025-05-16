class Main
{
	public static void main(String[] args)
	{
		char ch='5';
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
			if(ch>='A' && ch<='Z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					System.out.println("capital vowel");
				else
					System.out.println("not capital vowel");
			}
			else if((ch>='a' && ch<='z'))
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					System.out.println("small vowel");
				else
					System.out.println("not small vowel");
			}
		}
		
		else
			System.out.println("not Alphabet");
	}
}


