class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello All Good Morning");
		String[] s1=s.split(" ");
		int x,y;
		for(x=0;x<s1.length;x++)
		{
			for(y=0;y<s1[x].length();y++)
			{
				if(y%2==0)
				{
					char ch=s1[x].charAt(y);
					s1[x]=s1[x].replace(ch,Character.toUpperCase(ch));	
				}
				else 
				{
					char ch1=s1[x].charAt(y);
					s1[x]=s1[x].replace(ch1,Character.toLowerCase(ch1));
				}
			}
			System.out.print(s1[x]+" ");
		}
	}
}

