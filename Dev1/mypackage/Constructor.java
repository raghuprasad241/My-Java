package mypackage;

public class Constructor {

	// Constructor will not have a return type and its name should match class name.
	Constructor()
	{
		System.out.println("I am the constructor");
	}
	
	public static void main(String[] args) 
	{
		
	/* When ever I create an object, constructor body will get invoked. If you don't define a constructor 
		java will define one for you.	
	*/
	
		Constructor silly=new Constructor();
	}

}
