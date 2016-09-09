package mypackage;


class E
{
	E()
	{
		System.out.println("This is Class E");
	}
}

class F extends E
{
	F()
	{
		//Calls super() or super calle here.
		this(10); // Calls the constructor with compatible arguments in this class.
		System.out.print("This is class F");
	}
	
	F(int a)
	{
		System.out.println("This is Class F constructor with int argument");
	}
}

public class ThisWithParams {

	public static void main(String[] args) {
		
		F obj=new F();
	}

}