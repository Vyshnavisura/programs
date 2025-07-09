class Main
{
	public static void main(String[] args)
	{
		int a=-3,b=-5,r=0;
		if(a==0||b==0)
		{
			r=0;
		}
		boolean n=false;
		if(a<0)
		{
			a=-a;
			n= !n;//t
		}
		if(b<0)
		{
			b=-b;
			n= !n;//f
		}
		for(int i=0;i<b;i++)//1
		{
			r=r+a;//3//3=6//15
		}
		
		if(n)//
			r=-r;
			
		System.out.println(r);
	}

}