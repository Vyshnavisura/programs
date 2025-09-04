class Main
{
	public static void main(String[] args)
	{	
	String health="Excellent",area="village",gander="male";
	int age=30,amount=;
	if(age>25 && age<35)
	{
		if(health=="Excellent")
			
			if(area=="city"&& gander=="male")
				System.out.println("premium is rs.4 and policy cannot exceed 2lkh");
			else
				System.out.println("premium is rs.4 and policy cannot exceed 1lkh");
	}
	else if(age>25 && age<35 && health=="poor")
	{
		if(area=="village" && gander=="male")
			System.out.println("premium is rs.6 and policy cannot exceed 10000");
		else
			System.out.println("not insured");
	}
	else
		System.out.println("person not insured");
		
	}
}