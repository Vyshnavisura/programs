class Main
{
	public static void main(String[] args)
	{
		String s="Abcd";
		int result=s.codePointCount(0,4);
		//int a=s.codePointBefore(1);//gives the unicode value of 1st index character
		int a=s.codePoints(1);
		System.out.println(a);


		/*String s1="HELLO";
		String s2="hello";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s2));*/


		/*String s1="good";
		String s2=" morning";
		System.out.println(s1.concat(s2));*/


		/*String s="coding hub";
		System.out.println(s.contains("hub all"));
		System.out.println(s.contains("e"));
		System.out.println(s.contains("ing"));*/


		/*String s="coding hub";
		System.out.println(s.length());
		System.out.println(s.contentEquals("hub"));
		System.out.println(s.contentEquals("e"));
		System.out.println(s.contentEquals("coding hub"));*/


		/*char[] s1={'H','e','l','l','o'};
		String s2="";
		s2=s2.copyValueOf(s1, 0,5);
		System.out.println(s2);
		System.out.println(s2.hashCode());*/
		

		/*String s="hello all hello all";	
		System.out.println(s.indexOf("hello"));
		System.out.println(s.lastIndexOf("all"));*/

		/*String s="coding hub";
		System.out.println(s.replace('c','H'));*/

		/*String s="Hello!World";
		String s1[]=s.split("!");
		for(String temp:s1)
			System.out.println(temp);*/
		
		/*String s="Hello!World";
		System.out.println(s.substring(0,3));
		System.out.println(s.subSequence(2,6));*/

		/*String s="Hello!World";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());*/

		/*String a[]=new String[]{"hello","world"};
		String s=String.join(" * ",a);
		System.out.println(s);*/

		/*String s="hello".repeat(3);
		System.out.println(s);*/

		/*String s="hello";
		String s1=s.substring(3);
		System.out.println("sigle parameter="+s1);

		String s2="coding hub";
		String s3=s2.substring(0,4);
		System.out.println("double parameter="+s3);*/
	}
}