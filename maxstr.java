class Main
{
	public static void main(String[] args)
	{
		String s= new String("hello all good morning evening");
		String[] s1=s.split(" ");
		String max="";
		int maxlen=0;
		for(int x=0;x<s1.length;x++)
		{
			String copy=s1[x];
			if(maxlen<copy.length())
			{
				maxlen=copy.length();
				max=copy;
			}
			else
			{
				max=max+" "+copy;
			}
		}
		System.out.println(max);
		
	}
}