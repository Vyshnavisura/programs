class Main
{
	public static void main(String[] args)
	{
		String s="a1b2c3d4";
		StringBuffer sb=new StringBuffer();
		for(int x=0;x<s.length();x+=2)
		{
			char ch=s.charAt(x);
			int num=Character.getNumericValue(s.charAt(x+1));
			sb.append(String.valueOf(ch).repeat(num));
		}
		System.out.println(sb.toString());
	}
}




/*x++;
StringBuilder numStr = new StringBuilder();
for (; x < s.length() && Character.isDigit(s.charAt(x)); x++) 
{
numStr.append(s.charAt(x));
}
int num = Integer.parseInt(numStr.toString());*/