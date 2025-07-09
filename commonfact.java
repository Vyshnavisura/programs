class Main
{
	public static void main(String[] args)
	{
		int n1=20,n2=10,n3=(n1<n2)?n1:n2,end=n3;
		for(int start=1;start<=end;start++)
		{
			if(n1%start==0 && n2%start==0)
				System.out.println(start);
		}
	}
}