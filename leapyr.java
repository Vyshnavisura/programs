class Main
{
	public static void main(String[] args)
	{
		int year=4000;
		if(year%400==0||year%4==0 && year%100==0)
			System.out.println("Leap year");
		else
			System.out.println("not Leap year");
	}
}