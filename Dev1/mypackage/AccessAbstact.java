package mypackage;

public class AccessAbstact extends AbstractEg {

	public static void main(String[] args) 
	{
		
		AccessAbstact obj=new AccessAbstact();
		obj.keerti();
		obj.raghu();

	}
	
	public void keerti()
	{
		System.out.println("I am Keerti and got implemented in child class");
	}

}