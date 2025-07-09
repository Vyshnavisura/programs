class Main
{
	public static void main(String[] args)
	{
		Sample sample=new Sample(2.2);
		
	}
}

class Sample
{

	Sample()
	{
		System.out.println("default");
	}
	Sample(int x)
	{
		System.out.println("integer");
	}
	Sample(double x)
	{
		System.out.println("double");
	}
	Sample(int x,double y)
	{
		System.out.println("integer,double");
	}
}