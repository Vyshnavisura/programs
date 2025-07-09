class Main
{
	public static void main(String[] args)
	{
		String s=new String("371");
		int size=s.length();
		int a=Integer.parseInt(s);
		int sum=0;
		int n=a;
		while(n!=0)
		{
			sum+=(int)(Math.pow((n%10),size));
			n/=10;
		}
		System.out.println((a==sum)?"amstrong "+sum:"not amstrong "+sum);
	}
}