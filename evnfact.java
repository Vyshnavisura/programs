class Main
{
	public static void main(String[] args)
	{
		int num=8,end=num,count=0;
		//System.out.println("even factors are: ");
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
				count++;
				//System.out.println(start);
		}
		
		System.out.println("count of evn factors: "+count);
		if(count==6)
			System.out.println("super number");
	}
 
}