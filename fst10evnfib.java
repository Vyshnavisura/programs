class Main
{
	public static void main(String[] args)
	{	
		int f=0,s=1,t=0,c=0;
		for(c=1;c<20;)
		{
			if(f%2==0)//for even count 
			
			//if(f%2!=0)//for odd count
			{
				System.out.println(f);
				c++;
			}
			t=f+s;
			f=s;
			s=t;
		}	
	}
}