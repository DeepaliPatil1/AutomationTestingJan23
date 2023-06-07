package objectorientedprogrammingsystem;

public class AccessModifierParent 
{

	private int amount = 1000;
	public void compnyname()
	{
		System.out.println("Speedway");
	}
	public static void main(String[] args)
	{
		//object creating hear static or non static area
		AccessModifierParent amp = new AccessModifierParent();
		System.out.println(amp.amount);
	}
	// remove public here then it defolt
       void printamount()
	{
		 System.out.println(amount);
		
	}
       
       protected void demoMethod()
       {
    	   System.out.println("this is protected method");
       }
}
