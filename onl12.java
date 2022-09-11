abstract class onl12
{
void s()
{
	System.out.println("hii there ");	
}
}

class qwe extends onl12
{
	void s1()
	{
	super.s();
	}
}

class arp
{
	public static void main(String[] args)
	{
		qwe a1 = new qwe();
		a1.s1();
	}
}
