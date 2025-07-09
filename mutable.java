class Main
{
	public static void main(String[] args)
	{
		String s1="hello";
		String s2=s1;
		s1=s1+("world");
		System.out.println(s2+"---"+System.identityHashCode(s2));
		System.out.println(s1+"---"+System.identityHashCode(s1));
		StringBuffer sb=new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb+"----"+System.identityHashCode(sb));
	}
}