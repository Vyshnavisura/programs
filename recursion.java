class Main
{
	public static void main(String[] args)
	{
		Sample sample=new Sample();
		int n=7,start=1,c=0;
		sample.m1(n,start,c);
		System.out.println((c==2)?"prime":"not prime");
	}
}

class Sample
{
	int m1(int n,int start,int c)
	{
		
		if(start<=n)//1<=6t
		{
		
			if(n%start==0)//t
			{
				c++;//1
				m1(n,++start,c);
			}
			else
				m1(n,++start,c);
		}
		return c;
		//else
		//	System.out.println((c==2)?"prime":"not prime");	
	}
}