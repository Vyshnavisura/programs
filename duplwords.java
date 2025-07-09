import java.util.Arrays;
class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello all good morning all");
		String s1[]=s.split(" ");
		String compare="";
		for(int x=0;x<s1.length;x++)
		{
			String s2=s1[x];
			if(s.indexOf(s2)!=s.lastIndexOf(s2))
			{
				if(compare.indexOf(s2)==-1)
				{
					System.out.println(s2);
					compare=compare+s2;
				}
			}
		}
	}
}