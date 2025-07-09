class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello all good morning");
		String s1[]=s.split(" ");
		String max="";int c=0,c1=0;
		for(int x=0;x<s1.length;x++)
		{
			for(int y=0;y<s1[x].length();y++)
			{
				char ch=s1[x].charAt(y);
				if("aeiou".indexOf(ch)==-1)
				//if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					c++;
			}
			if(c>c1)
			{
				c1=c;
				max=s1[x];
			}
			else if(c==c1)
				max+=" "+s1[x];
		}
		System.out.println(max);
	}
}