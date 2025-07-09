class Main
{
	public static void main(String[] args)
	{
		String s=new String("h3ello all7 good morn1ing");
		char[] ch=s.toCharArray();
		String n="";
		for(int x=0;x<s.length();x++)
		{
			
			if(ch[x]>='0' && ch[x]<='9')
				n+=ch[x];
		}
		System.out.println(n);
		int size=n.length();
		int a=Integer.parseInt(n);
		int sum=0,copy=a;
		while(a!=0)
		{
			sum+=(int)(Math.pow((a%10),size));
			a/=10;
		}
		System.out.println((copy==sum)?"amstrong "+sum:"not amstrong "+sum);
		
	}
}