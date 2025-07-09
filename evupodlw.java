class Main
{
 	public static void main(String args[])
 	{
  		String s="hello all good morning";
 	 	String new_s="";
  		for(int i=0;i<s.length();i++)
  		{ 
			char c =s.charAt(i);
   			if(i%2==0)
   			{
    				new_s=new_s+Character.toUpperCase(c);
   			}
   			else
   			{
				new_s=new_s+Character.toLowerCase(c);
   			}
		}
  		System.out.println(new_s);
	}
}

