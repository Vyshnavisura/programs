class Main
{
	public static void main(String[] args)
	{
		System.out.println("AndhraBank:");
		AndhraBank ab=new AndhraBank();
		System.out.println("MaxTransactions : "+ab.maxTransactions()+"\n"+"MinimumBalance : "+ab.minimumBalance()+"\n"+"MaxWithDrawl : "+ab.maxWithDrawl()+"\n"+"Pincode : "+ab.pincode()+"\n"+"Location : "+ab.getLocation("Warangal Urban")+"\n");
				

		System.out.println("UnionBank :");
		UnionBank ub=new UnionBank();
		System.out.println("MaxTransactions : "+ub.maxTransactions()+"\n"+"MinimumBalance : "+ub.minimumBalance()+"\n"+"MaxWithDrawl : "+ub.maxWithDrawl()+"\n"+"Pincode : "+ub.pincode()+"\n"+"Location : "+ub.getLocation("Hanmakonda")+"\n");
		
		System.out.println("PNB :");
		PNB pb=new PNB();
		System.out.println("MaxTransactions : "+pb.maxTransactions()+"\n"+"MinimumBalance : "+pb.minimumBalance()+"\n"+"MaxWithDrawl : "+pb.maxWithDrawl()+"\n"+"Pincode : "+pb.pincode()+"\n"+"Location : "+pb.getLocation("Kazipet")+"\n");
		
		System.out.println("IndianBank :");
		IndianBank ib=new IndianBank();
		System.out.println("MaxTransactions : "+ib.maxTransactions()+"\n"+"MinimumBalance : "+ib.minimumBalance()+"\n"+"MaxWithDrawl : "+ib.maxWithDrawl()+"\n"+"Pincode : "+ib.pincode()+"\n"+"Location : "+ib.getLocation("Warangal Rural")+"\n");
	}
}

interface Bank
{
	int maxTransactions();
	int minimumBalance();
	int maxWithDrawl();
	public String getLocation(String location);
	default int pincode()
	{
		return 506002;
	}
}

class AndhraBank implements Bank
{
	public int maxTransactions()
	{
		return 4;
	}
	public int minimumBalance()
	{
		return 1500;
	}
	public int maxWithDrawl()
	{
		return 17000;
	}
	public String getLocation(String location)
	{
		return location;
	}
}

class UnionBank implements Bank
{
	public int maxTransactions()
	{
		return 7;
	}
	public int minimumBalance()
	{
		return 700;
	}
	public int maxWithDrawl()
	{
		return 10000;
	}
	public String getLocation(String location)
	{
		return location;
	}
}

class PNB implements Bank
{
	public int maxTransactions()
	{
		return 6;
	}
	public int minimumBalance()
	{
		return 1800;
	}
	public int maxWithDrawl()
	{
		return 7000;
	}
	public String getLocation(String location)
	{
		return location;
	}
}

class IndianBank implements Bank
{
	public int maxTransactions()
	{
		return 10;
	}
	public int minimumBalance()
	{
		return 0;
	}
	public int maxWithDrawl()
	{
		return 2500;
	}
	public String getLocation(String location)
	{
		return location;
	}
}



































