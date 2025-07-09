/*class Main
{
	public static void main(String[] args)
	{
		//Sample1 sample=new Sample1();
		//sample.m1();	
	}
}


final class Sample
{
	int x=10;
	
	void m1()
	{this.x=x+10;
		//System.out.println(y);
	}
}

class Sample1 extends Sample
{
	void m1()
	{
		System.out.println("int x");
	}
}*/


class Main
{
	public static void main(String[] args)
	{
		Sample.clg="KITS";
		System.out.println(Sample.clg);
	}
}
class Sample
{
	static String clg;
	static
	{
		clg="BITS";
	}
}






























