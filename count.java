class Main
{
	public static void main(String[] args)
	{
		String s=new String("HEllo ! @ #123");
		int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch>='A' && ch<='Z')
			{
				c1++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					c2++;
				else
					c3++;
			}
			else if(ch>='a' && ch<='z')
			{
				c4++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					c5++;
				else
					c6++;
			}
			else if(ch>='0' && ch<='9')
			{
				c7++;
			}
			else if(ch ==' ')
			{
				c8++;
			}
			else
				c9++;
		}
		System.out.println("capital  count = "+c1);
		System.out.println("cap vowl count = "+c2);
		System.out.println("cap con  count = "+c3);
		System.out.println("small    count = "+c4);
		System.out.println("small vl count = "+c5);
		System.out.println("sml con  count = "+c6);
		System.out.println("digits   count = "+c7);
		System.out.println("spaces   count = "+c8);
		System.out.println("symbols  count = "+c9);
	}
}