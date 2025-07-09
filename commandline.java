class Main
{
	public static void main(String[] args)
	{
		System.out.println(Integer.parseInt("123")+123);
		//System.out.println(Float.parseFloat("123")+123);
		//String s=args[2];
		//System.out.println(s);
		System.out.println("number of arguements: "+args.length);
		for(int x=0;x<args.length;x++)
		{
			System.out.println(args[x]);
		}
	}
}