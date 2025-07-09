class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50};
		int low=0,high=a.length-1,search=40,c=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]>search)
				high=mid-1;
			else if(a[mid]==search)
			{
				c++;
				break;
			}
			else
				low=mid+1;
		}
		if(c==1)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element not found");
		}				
	}
}