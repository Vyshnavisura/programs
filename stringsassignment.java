/*upper to lower and vice versa
class Main
{
	public static void main(String[] args)
	{
		String s=new String("hELLO all good morning");
		String[] s1=s.split(" ");
		for(int x=0;x<s1.length;x++)
		{
			char ch=s1[x].charAt(0);
			if(ch>='A' && ch<='Z')
			{
				s1[x]=s1[x].replace(ch,Character.toUpperCase(ch));
			}
			else if(ch>='a' && ch<='z')
			{
				s1[x]=s1[x].replace(ch,Character.toLowerCase(ch));
			}
			System.out.print(s1[x]+" ");
		}
	}
}*/


/*string palindrome
class Main
{
	public static void main(String[] args) 
	{
        	String s= "a man, a plan & a canal , panama 1";
       		String s1 = "";
		for (int i = 0; i < s.length(); i++) 
		{
            		char ch = s.charAt(i);

            		if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') 
			{
                		s1 +=ch;
            		}
        	}
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer s2=sb.reverse();
		System.out.println((s1.contentEquals(s1))?"palindrome":"not palindrome");
    }
}*/





/*
class Main
{
	public static void main(String[] args) 
	{
        	String s="Hello all good morning";
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
            		char ch = s.charAt(i);
			if(s.indexOf(ch)!=s.LastIndexOf(ch))
			{
				s1+=ch;
			}
		}
		System.out.println(s1);
	}
}*/

/*vowel,consonant,space,digit,symbols count
class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello all & 2 23");
		String s1="";
		String s2="";int c1=0,c2=0,c3=0,c4=0,c5=0;
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					c1++;
					s1+=ch;
				}
				else 
					c2++;
			}
			else if(ch ==' ')
				c3++;
			else if(ch>='0' && ch<='9')
				c4++;
			else
				c5++;

		}
		System.out.println(s1+"\n"+c1+"\n"+c2+"\n"+c3+"\n"+c4+"\n"+c5);
	}
}*/

/*searching for a char
class Main
{
	public static void main(String[] args)
	{
		String s="Hello";
		System.out.println((s.contains("g"))?"found":"not found");
	}
}
*/


/*palindrome sum and string
class Main
{
	public static void main(String[] args)
	{
		String s="hello 1 and 2 #1";
		String s1="";int sum=0;
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=sb.reverse();
		System.out.println((s.contentEquals(sb1))?"pal":"not palin");
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(Character.isDigit(ch))
			{
				int n=Character.getNumericValue(ch);
				sum+=n;
				s1+=ch;
			}
		}
		System.out.println(sum+"\n"+s1);
		StringBuffer s2=new StringBuffer(s1);
		StringBuffer s3=s2.reverse();
		System.out.println((s1.contentEquals(s3))?"pal":"not palin");
	}
}*/


/*unique
class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello all good morning");
		char[] ch=s.toCharArray();
		for(int x=0;x<=ch.length-1;x++)
		{
			if(s.indexOf(ch[x])==s.lastIndexOf(ch[x]))
				System.out.print(ch[x]);
		}
	}
}*/

/*duplicate
class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello all good morning");
		char[] ch=s.toCharArray();String compare="";
		for(int x=0;x<=ch.length-1;x++)
		{char s2=ch[x];
			if(s.indexOf(ch[x])!=s.lastIndexOf(ch[x]))
			{
				if(compare.indexOf(s2)==-1)
				System.out.print(s2);
				compare+=s2;
			}
		}
	}
}*/








































