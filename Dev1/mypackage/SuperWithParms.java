package mypackage;


class C
{
	C(int a)
	{
		System.out.println("This is Class C");
	}
}

class D extends C
{
	D()
	{
		super(10); // Calls super/parent class constructor.
		// If super calle is not placed compiler will create one and call it. You can test it by commenting out.
		System.out.print("This is class D");
	}
}

public class SuperWithParms {

	public static void main(String[] args) {
		
		D obj=new D();
	}

}
