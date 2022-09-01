//static variable modifiers 
//for this method  is also to be given static or public  

 class abc
{
	static int a=5;
	static void s()
	{
	a = a+5;
	System.out.println(a);
	a+=6;
	System.out.println(a);
	a+=12;
	}
	void s1()
	{
	System.out.println(a);
	}
}
class staticvariablemodif
{
	public static void main(String[] args)
	{
	abc a1 = new abc();
	a1.s();
	a1.s1();
	}
}