class Main 
{
    
	public static void main(String[] args)
    
	{
        
		String customer="Vyshnavi";
        
		String Date="10-05-2025";
        
		String item="Items",offer="coupon",pm="cash";  
        
		double Total=200.00,discount=0,pd=0;
 
		if(offer=="coupon")
		{
			discount=20.0/100*Total;
		}
		else
		{
			discount=15.0/100*Total;
		}       
        
        
		

		if(pm=="cc")
		{
			pd=5.0/100*Total;
		}
		else if(pm=="dc")
		{
			pd=4.5/100*Total;
		}
		else if(pm=="phnpay")
		{
			pd=4.0/100*Total;
		}
		else if(pm=="gp")
		{
			pd=3.5/100*Total;
		}
		else if(pm=="paytm")
		{
			pd=3.0/100*Total;
		}
		else
		{
			pd=0;
		}
		 double ftotal=Total-pd-discount;
		
			System.out.println("====================================");
        
			System.out.println("        " + "Bear Coffee Shop");
        
			System.out.println("      " + "Road no:10,Kukatpally");
        
			System.out.println("        "+"Phno:987-654-3210");
        
			System.out.println("====================================");
        
			System.out.print("Customer: ");
        
			System.out.println(customer);
        
			System.out.print("Date: ");
        
			System.out.println(Date);
        
			System.out.println("-------------------------------------");
        
			System.out.print(item);
        
			System.out.println("           "+"Qty"+"    "+"Price"+"   "+"Total");
        
			System.out.println("--------------------------------------");
        
			System.out.println("Cappuccino"+"       "+"2"+"     "+"30.00"+"      "+"60.00");
        
			System.out.println("Espresso"+"         "+"3"+"     "+"20.00"+"      "+"60.00");
        
			System.out.println("Croissant"+"        "+"3"+"     "+"40.00"+"      "+"80.00");
        
			System.out.println("--------------------------------------");
        
			System.out.println("Total"+"        "+"   "+"     "+"        "+"     "+"200.00");
        
			double tax=Total*0.05;
        
			System.out.println("Discount"+"                          "+discount);
        
			
System.out.println("PaymentMode"+"         "+ pm+"          "+pd);        
			System.out.println("Final Total"+"                       "+ftotal);
        
			System.out.println("=======================================");
        
			System.out.println("        "+"Thank You! Visit Again :)");
        
			System.out.println("=======================================");
        
        

    
	}

}




















