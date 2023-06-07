package objectorientedprogrammingsystem;

public class ChildMethodOverriding extends ParentMethodOverriding {

	public static void main(String[] args)
	{
		ChildMethodOverriding cmo = new ChildMethodOverriding();
		cmo.explicitWait(150);
		
	}
	
	public void explicitWait(int duration )
	{
		System.out.println("explicit Wait is  seconds" + duration); 
		
	}

}
