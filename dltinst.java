class Main
{
	public static void main(String[] args)
	{
		Sample sample=new Sample();
		int[] a=new int[]{1,2,3,4,5,6,7,8,9};
		int search=10;
		int index=sample.searchElm(a,search);
		if(index>0)
		{
			int[] del=sample.deleting(a,index);
			for(int temp:del)
				System.out.println(temp+" ");
		}
		else
		{
			int[] insert=sample.insertion(a,search);
			for(int temp:insert)
				System.out.println(temp+" ");

		}	
	}
}

class Sample
{
	int searchElm(int[] a,int search)
	{
		for(int x=0;x<=a.length-1;x++)
		{
			if(search==a[x])
				return x;
		}
		return -1;
	}
	int[] deleting(int[] a,int index)
	{
		for(int x=index;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		a[a.length-1]=0;
		return a;
	}
	int[] insertion(int[] a,int search)
	{
		int in=8;
		for(int x=a.length-1;x>=in+1;x--)
		{
			a[x]=a[x-1];
		}
		a[in]=search;
		return a;
	}
}