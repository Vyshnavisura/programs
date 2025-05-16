class Main
{
	public static void main(String[] args)
	{
		int m1=0,m2=97,m3=99,m4=79,m5=90,m6=89;
		
		double total=m1+m2+m3+m4+m5+m6,max_marks=600,p=(total/max_marks)*100;

		String s=(p>=90)?"A+ grade":(p>=80)? "A grade":(p>=70)?"B grade":(p>=60)? "C grade":(p>=35)?"D grade":"Fail";
			
		System.out.println(p+" "+s);
	}
}