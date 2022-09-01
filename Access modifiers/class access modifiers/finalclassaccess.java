//Final class = it is a class which cannot be extended by any other class.

final class onl1
{
	void s()
	{
		System.out.print("today is monday");
	}
}
class arp extends onl1

{
	void s1()
	{
	super.s();
	}
}
class finalclassaccess
{
	public static void main(String[] args)
	{
	arp a1 = new arp();
	a1.s();	
	}
}