/**
 * 
 */
package mypackage;

/**
 * @author Raghu Cherukuru
 *
 */
public class Sum {

	public void sum(int ...var)
	{
		int sum=0;
		for (int tmp : var)
		{
			sum=sum+tmp;
		}
			
		System.out.println("The sum of the numbers is " +sum+".");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sumobj=new Sum();
		sumobj.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	}

}
