class Main
{
	public static void main(String[] args)
	{
	char ch='a',ch1=0;
	if(ch>='A' && ch<='Z')
	{
		ch1=(char)(ch+32);
		System.out.println(ch1);
	}
	else if(ch>='a' && ch<='z')
	{
		ch1=(char)(ch-32);
		
		System.out.println(ch1);	
	}
	else
		System.out.println("invalid");
	}
}