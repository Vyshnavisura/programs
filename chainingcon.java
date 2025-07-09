class Main
{
	public static void main(String[] args)
	{
		Sample sample=new Sample();
	}
}

class Sample
{
	Sample()
	{
		this(1);
		System.out.println("default");
	}
	Sample(int x)
	{
		this(2.2);
		System.out.println("integer");
	}
	Sample(double y)
	{
		System.out.println("double");
	}
}