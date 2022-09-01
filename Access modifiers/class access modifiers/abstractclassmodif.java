//abstract class - object cannot be created for this class.
// For calling such class ,inheritance is to be created.

abstract class abc
{
void s()
{
	System.out.println("Students have to Wake Up at 5.30am in the morning.");	
}
}

class qwe extends abc
{
	void s1()
	{
	super.s();
	System.out.println("Students should get ready for exercise by 5.55am");
	}
}

class abstractclassmodif
{
	public static void main(String[] args)
	{
		qwe a1 = new qwe();
		a1.s1();
	}
}
