class Main
{
	public static void main(String[] args)
	{
		Sample sample=new Sample(123);
		System.out.println(sample.print());	
	}
}

class Sample
{
	int number;
	Sample(int number)
	{
		this.number=number;
	}
	int print()
	{
		return number;
	}
}