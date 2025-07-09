class Main
{
	public static void main(String[] args)
	{
		int n=95263,c=0,rem=0,c1=0,mul=1,mul1=1,cpy=0;
		while(n!=0)
		{
			rem=n%10;
			c++;
			if(c==1 ||c==2)
				mul=mul*rem;//6*3=18
			else if(c==3||c==4)
				mul1=mul1*rem;//2*5=10
			else
				cpy=rem;//9
			n/=10;		
		}
		System.out.println(mul);
		System.out.println(mul1);
		System.out.println(cpy);
		System.out.println(mul+mul1+cpy);//37	
		
	}
}