class Main
{
	public static void main(String[] args) 
	{
        	int n=850;
       		while (true) 
		{
			int n1=n,rev=0;
        		while (n!=0) 
			{
				int rem= n%10;
            			rev= rev*10+rem;
            			n/=10;
			}	
				if (rev==n1) 
				{
					System.out.println(rev+ " is a palindrome: " + n1); 
					break;
				}
				else 
				{
                			n1+=rev;
               				n=n1;
            			}
			
		} 
	}
}


 