// abstract method it means there is no object for such,object can only be made by overiding method.
// for this we have to abstract the class also and override the method.



abstract class abc
{
	abstract void s();
	{
	System.out.println("hello");
	}
	
}
class bcd extends abc 
{
public void s()
	{
	// we have to override here not by super class super.s();
	}
}

class abstractmethod
{
	public static void main(String[] args)
	{
	bcd a1 = new bcd();
	a1.s();
	}
	
}