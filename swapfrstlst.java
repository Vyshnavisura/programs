class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello all good morning");
		String s1[]=s.split(" ");
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		for(int x=0;x<s1.length;x++)
			System.out.println(s1[x]);
	}	
}