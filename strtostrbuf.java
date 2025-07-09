class Main
{
	public static void main(String[] args)
	{
		String s1=new String("hello");
		StringBuffer sb=new StringBuffer(s1);
		StringBuilder sb1=new StringBuilder(s1);
		System.out.println(sb+" "+sb1);
		String s2=new String(sb);
		System.out.println(s2);
	}
}