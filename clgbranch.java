class Main
{
	public static void main(String[] args)
	{
		String branch="ECE",sub1="0",sub2="0",sub3="0",sub4="0";
		int fee=0,schr=0;
		if(branch=="ECE")
		{		
			sub1="RS";sub2="VLSI";sub3="MCMP";sub4="DCN";
			fee=60000;schr=35000;
		}
		else if(branch=="cse")
		{
		 	sub1="java";sub2="python";sub3="sl";sub4="pps";
			fee=80000;schr=35000;
		}
		else  if(branch=="EEE")
		{
			sub1="MPMC";sub2="DCN";sub3="Maths1";sub4="PPS";
			fee=57000;schr=35000;
		}
		else if(branch=="Mech")
		{
			sub1="Drawing";sub2="M1";sub3="ML";sub4="solids";
			fee=50000;schr=35000;
		}
		else if(branch=="civil")
		{
			sub1="drawing";sub2="M2";sub3="Python";sub4="XXX";
			fee=53000;schr=35000;
		}
		else
		{
			String a="this branch is not available in this college";
		}
		System.out.println("Branch: "+branch);
		System.out.println("subjects: ");
		System.out.println("          "+sub1);
		System.out.println("          "+sub2);
		System.out.println("          "+sub3);
		System.out.println("          "+sub4);
		System.out.println("Fee : "+fee);
		System.out.println("Scholorship: "+schr);

	}
}