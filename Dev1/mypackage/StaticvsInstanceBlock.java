package mypackage;

public class StaticvsInstanceBlock {

	// This is a static block and gets loaded every time a class is loaded. Not dependent on main function. 
	static
	{
		System.out.println("I am a static or class block");
	}
	
	public static void main(String[] args) {
		System.out.println("Start of main function");
		
		//Creating objects to validate if the instance block gets executed every time I instantiate an object.
		
		StaticvsInstanceBlock obj1=new StaticvsInstanceBlock();
		StaticvsInstanceBlock obj2=new StaticvsInstanceBlock();

	}
	
	// This is an instance block and gets executed every time an object is created.
	{
		System.out.println("This is an instance block");
	}

}
