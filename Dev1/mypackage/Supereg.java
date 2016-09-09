package mypackage;

class A
{
	A()
	{
		System.out.println("This is Class A");
	}
}

class B extends A
{
	B()
	{
		super(); // Calls super/parent class constructor.
		// If super calle is not placed compiler will create one and call it. You can test it by commenting out.
		System.out.print("This is class B");
	}
}

public class Supereg {

	public static void main(String[] args) {
		
		B bobj=new B();

	}

}
