class A
{
	private void m1()
	{
		System.out.println("I am a Class A m1 private function");
	}
	
	public void m2()
	{
		System.out.println("I am Class A m2 function");
		m1(); // This is how you access private methods indirectly.
	}
}

class B extends A
{
	public void m3()
	{
		System.out.println("I am in Class B");
	}
}

public class SecureClass {

	public static void main(String[] args) {
		
		B objb=new B();
		objb.m3();
		objb.m2();

	}

}
