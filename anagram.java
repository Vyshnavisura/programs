import java.util.Arrays;
class Main
{
	public static void main(String[] args)
	{
		String s1=new String("cat");
		String s2=new String("edge");
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length==ch2.length)
		{
			if(Arrays.compare(ch1,ch2)==0)
				System.out.println("Anagram");
		
			else
				System.out.println("Not Anagram");
		}
		else
			System.out.println("length is not equal");
	}
}