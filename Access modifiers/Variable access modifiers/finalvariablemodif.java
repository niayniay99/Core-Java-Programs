//final variable modfier
//it does not allow to be static .hence value remains same


 class abc
{
	final int a=5;
	final void s()
	{
//	a = a+5; Changes are not allowed where variable is FINAL
	System.out.println(a);
//	a+=6; Changes are not allowed where variable is FINAL
	System.out.println(a);
//	a+=12; Changes are not allowed where variable is FINAL
	}
	void s1()
	{
	System.out.println(a);
	}
}
class finalvariablemodif
{
	public static void main(String[] args)
	{
	abc a1 = new abc();
	a1.s();
	a1.s1();
	}
}


