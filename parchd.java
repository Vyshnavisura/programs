class Parent
{
 	int a;
 	String name;
	Parent(int a,String name)
 	{
  		this.a=a;
  		this.name =name;
 	}
 	void parentPrint()
 	{
  		System.out.println(a);
  		System.out.println(name);
 	}
}
class child extends Parent
{
 	int a ;
 	String name;
 	child(int n,String num)
 	{
		super( n, num);
  		a=12;
  		name="uvk";
  
 	}
	void ParentDetails()
 	{
  		super.a=this.a;
  		super.name=this.name;
  		System.out.println(a);
  		System.out.println(name);
 	}
	public static void main(String args[])
 	{
  		child c =new child(50,"hs");
  		c.parentPrint();
  		//c.(20,"Venkat");
	}
  

 }
 