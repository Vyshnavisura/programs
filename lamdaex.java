//instaed of writing child classes we are using lamda expression

@FunctionalInterface
interface A
{
	public void m1(int x,String y);
}

class Main
{
	public static void main(String[] args)
	{
		/*A a=()-> //obj creation(lamda expression used to reduce the code)
		{
			System.out.println("welcome");
			System.out.println("welcome to coding world");
		};  
		//if multiple statements are their then use {}; if not no of using {};

		a.m1();*/

		A a=(x,y)->System.out.println(x+" "+y);//passing parameters
		a.m1(10,"vyshu");
	}
}