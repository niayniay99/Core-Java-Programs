//Final access modifiers

class abc
{
	final void s()
	{
	System.out.println("hello everyone");
	}
}
class bcd extends abc
{
	void s1()
	{
		super.s();
		System.out.println("How are you");
	}
}
class finalmethodmodif
{
	public static  void main(String[] args)
	{
	bcd a1 = new bcd();
	a1.s1();
	}
}