class Main
{
	public static void main(String[] args)
	{
		String s=new String("HELLO all good morning");
		System.out.println(s.length());//int//to find ength of string
		System.out.println("hello".equals("hello"));//boolean//to compare content of two strings
		System.out.println("hello"=="hello");//boolean//to compare reference of two strings
		System.out.println("hello".toUpperCase());//string//to cnvert loweracse to upper case
		System.out.println(s.toLowerCase());//string
		System.out.println("hello all good morning".charAt(2));//char
		System.out.println("hi all".concat("good morning"));//string
		System.out.println("hi all good morning".indexOf('o'));//int
		System.out.println("hi all good morning".indexOf("all"));//int
		System.out.println("hi all good morning".lastIndexOf('o'));//int
		//System.out.println("hi all good morning".lastindexOf("hi"));//int
		String []a=s.split(" ");
		for(String temp:a)
			System.out.println(temp);
	}
}