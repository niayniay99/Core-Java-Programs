//static method modifiers 
//for this variable is also to be given static 

class abc
{
	static int a=5;
	public void s()
	{
	a = a+5;
	System.out.println(a);
	}
}
class staticmethodmodif
{
	public static void main(String[] args)
	{
	abc a1 = new abc();
	a1.s();
	}
}