class a 
{
	void s()
	{
	System.out.println("CLASS A METHOD S");
	}
	void s1()
	{
	System.out.println(" CLASS A METHOD S1");
	}
}
class b extends a{
	void s()
	{
	System.out.println(" CLASS B METHOD S");
	}
	void s2()
	{
	System.out.println(" CLASS B METHOD S2");
	}
}

 
class objref
{
	public static void main(String[] args)
	{
	a a1 = new a();
	a1.s();
	b b1 = new b();
	b1.s();

	a a2 = new b();
	a2.s();
	a2.s1();
//	a2.s2();     

//	b b2 = new a(); 
//	b2.s();
//	b2.s1();
//	b2.s2();
	}
}


 