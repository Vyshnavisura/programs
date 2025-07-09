class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello all good morning");
		String[] s1=s.split(" ");
		for(int x=0;x<s1.length;x++)
		{
			String s2=s1[x];
			int c=0,c1=0;
			for(int y=0;y<s2.length();y++)
			{
				char ch=s2.charAt(y);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					c++;
			}
			System.out.println("Number of vowels in "+s2+" are== "+c1);
		}
	}
}