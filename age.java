class Main
{
	public static void main(String[] args)
	{
		int age=68;
		
		if(age>=60)
			System.out.println("senior citizen");
		else if(age>=18)
			System.out.println("major");
		else
			System.out.println("minor");
	}
}



///using ternary operator
int age=17;
String s=(age>=100)?"Invalid age":(age>=60)?"Senior Citizen":(age>=18)?"major":"minor";
			System.out.println(s);